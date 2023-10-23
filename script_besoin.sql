CREATE ROLE gestion LOGIN PASSWORD gestion;
CREATE DATABASE gestion_rh;
ALTER DATABASE gestion_rh OWNER TO gestion;

\c gestion_rh gestion
CREATE EXTENSION postgis;

--------------------- Details entreprise -----------------------

CREATE TABLE entreprise(
    id_entreprise SERIAL PRIMARY KEY,
    nom_entreprise VARCHAR(20),
    NIF VARCHAR(12),
    STAT VARCHAR(12),
    adresse VARCHAR(30),
    localisation GEOMETRY
);

CREATE TABLE departement(
    id_dept SERIAL PRIMARY KEY,
    nom_dept VARCHAR(20),
    id_entreprise INT REFERENCES entreprise(id_entreprise)
);

CREATE TABLE domaine(
    id_domaine SERIAL PRIMARY KEY,
    designation VARCHAR(20)
);

CREATE TABLE services(
    id_service SERIAL PRIMARY KEY,
    nom_service VARCHAR(30),
    id_dept INT REFERENCES departement(id_dept),
    id_domaine INT REFERENCES domaine(id_domaine)  
);

CREATE TABLE poste(
    id_poste SERIAL PRIMARY KEY,
    id_service INT REFERENCES services(id_service),
    -- id_type_contrat int not null,
    nom_poste VARCHAR(20),
    heure_jour INT/*,
    mission VARCHAR*/
);

-------------------------- Besoin poste -------------------------

CREATE TABLE besoin(
    id_besoin SERIAL PRIMARY KEY,
    id_poste INT REFERENCES poste(id_poste),
    nombre INT,
    date_demande DATE,
    date_limite DATE
);

-------------------------- Requis --------------------------------

CREATE TABLE diplome(
    id_diplome SERIAL PRIMARY KEY,
    niveau INT,
    designation VARCHAR(20)
);

CREATE TABLE nationalite(
    id_nat SERIAL PRIMARY KEY,
    niveau INT,
    designation VARCHAR(20)
);

CREATE TABLE s_matrimoniale(
    id_s_matrimo SERIAL PRIMARY KEY,
    niveau INT,
    designation VARCHAR(20)
);

CREATE TABLE experience(
    id_exp SERIAL PRIMARY KEY,
    minimum INT NOT NULL,
    maximum INT NOT NULL,
    niveau INT
);

----------------------------- Notation ------------------------

CREATE TABLE notation_nat(
    id_note_nat SERIAL PRIMARY KEY,
    id_nat INT REFERENCES nationalite(id_nat),
    id_besoin INT REFERENCES besoin(id_besoin),
    note INT DEFAULT 0
);

-- mety expérience @ poste équivalent
CREATE TABLE notation_exp(
    id_note_exp SERIAL PRIMARY KEY,
    id_exp INT REFERENCES experience(id_exp),
    id_domaine INT REFERENCES domaine(id_domaine),
    id_besoin INT REFERENCES besoin(id_besoin),
    note INT DEFAULT 0
);

CREATE TABLE notation_s_mat(
    id_note_s_mat SERIAL PRIMARY KEY,
    id_s_mat INT REFERENCES s_matrimoniale(id_s_matrimo),
    id_besoin INT REFERENCES besoin(id_besoin),
    note INT DEFAULT 0
);

CREATE TABLE notation_diplome(
    id_note_dip SERIAL PRIMARY KEY,
    id_diplome INT REFERENCES diplome(id_diplome),
    id_besoin INT REFERENCES besoin(id_besoin),
    note INT DEFAULT 0
);

CREATE TABLE notation_adresse(
    id_note_adr SERIAL PRIMARY KEY,
    minimum INT NOT NULL,
    maximum INT NOT NULL,
    id_besoin INT REFERENCES besoin(id_besoin),
    note INT DEFAULT 0
);

------------------------- Critère ----------------------------

CREATE TABLE critere_nat(
    id_cri_nat SERIAL PRIMARY KEY,
    id_nat INT REFERENCES nationalite(id_nat),
    id_besoin INT REFERENCES besoin(id_besoin),
    coeff INT DEFAULT 1
);

CREATE TABLE critere_exp(
    id_cri_exp SERIAL PRIMARY KEY,
    id_exp INT REFERENCES experience(id_exp),
    id_domaine INT REFERENCES domaine(id_domaine),
    id_besoin INT REFERENCES besoin(id_besoin),
    coeff INT DEFAULT 1
);

CREATE TABLE critere_s_mat(
    id_cri_s_mat SERIAL PRIMARY KEY,
    id_s_mat INT REFERENCES s_matrimoniale(id_s_mat),
    id_besoin INT REFERENCES besoin(id_besoin),
    coeff INT DEFAULT 1
);

CREATE TABLE critere_diplome(
    id_cri_dip SERIAL PRIMARY KEY,
    id_diplome INT REFERENCES diplome(id_diplome),
    id_besoin INT REFERENCES besoin(id_besoin),
    coeff INT DEFAULT 1
);

CREATE TABLE critere_adresse(
    id_cri_adr SERIAL PRIMARY KEY,
    maximum DOUBLE PRECISION NOT NULL, -- distance max ipetrahan'ny olona
    coeff INT DEFAULT 1
);

----------------------------------------------
ALTER TABLE critere_adresse ADDCOLUMN id_besoin INT REFERENCES besoin(id_besoin);

CREATE TABLE critere_age(
    id_cri_age SERIAL PRIMARY KEY,
    minimum INT NOT NULL DEFAULT 18,
    maximum INT NOT NULL DEFAULT 45,
    id_besoin INT REFERENCES besoin(id_besoin),
    coeff INT DEFAULT 1
);

----------------------------------------------

CREATE TABLE personne(
    id_personne SERIAL PRIMARY KEY,
    nom VARCHAR(30),
    prenom VARCHAR(30),
    date_naissance DATE,
    CIN VARCHAR,
);

CREATE TABLE employe(
    id_emp SERIAL PRIMARY KEY,
    id_personne INT REFERENCES personne(id_personne),
    id_contrat INT REFERENCES contrat(id_contrat)
);

CREATE TABLE candidature(
    id_candidature SERIAL PRIMARY KEY,
    date_candidature DATE,
    id_besoin INT REFERENCES besoin(id_besoin),
    id_personne INT REFERENCES personne(id_personne)
);

-------------------------------------------------------------

CREATE TABLE mission(
    id_mission SERIAL PRIMARY KEY,
    descriptions TEXT NOT NULL
);

CREATE TABLE mission_poste(
    id_poste INT REFERENCES poste(id_poste),
    id_mission INT REFERENCES mission(id_mission)
);

CREATE TABLE tache(
    id_tache SERIAL PRIMARY KEY,
    descriptions TEXT NOT NULL
);

CREATE TABLE tache_poste(
    id_poste INT REFERENCES poste(id_poste),
    id_tache INT REFERENCES tache(id_tache)
);

ALTER TABLE poste ADDCOLUMN droit DOUBLE PRECISION NOT NULL;

-------------------------------------------------------------

CREATE TABLE fiche_poste(
    id_fiche_poste SERIAL PRIMARY KEY,
    id_poste REFERENCES poste(id_poste),
    date_debut DATE NOT NULL,
    date_fin DATE DEFAULT NULL
);

CREATE TABLE cv(
    id_cv SERIAL PRIMARY KEY,
    -- id_annonce int not null,
    id_personne int not null,
    date_envoi_cv date,
    id_diplome int not null,
    id_nationalite int not null,
    id_s_matrimo int not null,
    id_exp int not null,
    -- foreign key(id_annonce) references v_annonce(i)
    foreign key(id_personne) references personne(id_personne),
    foreign key(id_diplome) references diplome(id_diplome),
    foreign key(id_nationalite) references nationalite(id_nat),
    foreign key(id_s_matrimo) references s_matrimoniale(id_s_matrimo),
    foreign key(id_exp) references experience(id_exp)
);

CREATE TABLE avantage(
    id_avantage serial PRIMARY key,
    descri_avantage VARCHAR
);

CREATE TABLE contrat(
    id_contrat SERIAL PRIMARY key,
    id_personne int not null,
    type_contrat int not null,
    salaire_brut decimal,
    id_poste int not null,
    debut date,
    fin date
);

CREATE TABLE type_contrat(
    id_type_contrat serial PRIMARY KEY,
    nom_type_contrat VARCHAR
);

CREATE TABLE avantage_contrat(
    id_avantage_contrat SERIAL PRIMARY KEY,
    id_contrat int not null,
    id_avantage int not null,
    foreign key(id_contrat) references contrat(id_contrat),
    foreign key(id_avantage) references avantage(id_avantage)
);


ALTER TABLE poste ADD COLUMN id_type_contrat INT REFERENCES type_contrat(id_type_contrat);
ALTER TABLE poste ADD COLUMN mission VARCHAR;


