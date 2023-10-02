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
    nom_poste VARCHAR(20),
    heure_jour INT
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
    id_s_mat INT REFERENCES s_matrimoniale(id_s_mat),
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
