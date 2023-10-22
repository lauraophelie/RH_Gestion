ALTER TABLE poste ADD COLUMN salaire_base DOUBLE PRECISION;
ALTER TABLE poste DROP COLUMN heure_jour;
ALTER TABLE poste ADD COLUMN heure_mois DOUBLE PRECISION;

ALTER TABLE employe ADD COLUMN id_poste INT REFERENCES poste(id_poste);

-------------------- Base cnaps -------------------------

CREATE DATABASE cnaps;
ALTER DATABASE cnaps OWNER TO gestion;

CREATE TABLE

CREATE TABLE employeur(
    id_employeur SERIAL PRIMARY KEY,
    nom_entreprise VARCHAR(20),
    NIF VARCHAR(20) UNIQUE NOT NULL,
    STAT VARCHAR(20) UNIQUE NOT NULL
);

CREATE TABLE employe(
    id_employe SERIAL PRIMARY KEY,
    nom VARCHAR(20),
    prenom VARCHAR(30),
    debut date,
    date_naissance date,
    id_employeur INT REFERENCES employeur(id_employeur)
);

CREATE TABLE payement_cnaps(
    id SERIAL PRIMARY KEY,
    id_employe INT REFERENCES employe(id_employe),
    id_employeur INT REFERENCES employeur(id_employeur),
    date_payement date NOT NULL DEFAULT NOW(),
    valeur DOUBLE PRECISION NOT NULL 
);

CREATE TABLE historique_employeur(
    id SERIAL PRIMARY KEY,
    id_employe INT REFERENCES employe(id_employe),
    id_employeur INT REFERENCES employeur(id_employeur),
    date_embauche date NOT NULL
);

CREATE TABLE historique_salaire(
    id SERIAL PRIMARY KEY,
    id_employe INT REFERENCES employe(id_employe),
    dernier_salaire_base DOUBLE PRECISION NOT NULL,
    date_prom date NOT NULL
);

--------------------------- Base ostie -------------------------

CREATE DATABASE ostie;
ALTER DATABASE ostie OWNER TO gestion;

CREATE TABLE employeur(
    id_employeur SERIAL PRIMARY KEY,
    nom_entreprise VARCHAR(20),
    NIF VARCHAR(20) UNIQUE NOT NULL,
    STAT VARCHAR(20) UNIQUE NOT NULL
);

CREATE TABLE employe(
    id_employe SERIAL PRIMARY KEY,
    nom VARCHAR(20),
    prenom VARCHAR(30),
    debut date,
    date_naissance date,
    id_employeur INT REFERENCES employeur(id_employeur) DEFAULT NULL,
    salaire_base DOUBLE PRECISION
);

CREATE TABLE historique_employeur(
    id SERIAL PRIMARY KEY,
    id_employe INT REFERENCES employe(id_employe),
    id_employeur INT REFERENCES employeur(id_employeur),
    date_embauche date NOT NULL
);

CREATE TABLE historique_salaire(
    id SERIAL PRIMARY KEY,
    id_employe INT REFERENCES employe(id_employe),
    dernier_salaire_base DOUBLE PRECISION NOT NULL,
    date_prom date NOT NULL
);

CREATE TABLE payement_ostie(
    id SERIAL PRIMARY KEY,
    id_employe INT REFERENCES employe(id_employe),
    date_payement date NOT NULL DEFAULT NOW(),
    valeur DOUBLE PRECISION NOT NULL 
);

--------------------------- salaire ---------------------------

CREATE TABLE pointage(
    id_emp INT REFERENCES employe(id_emp),
    date_jour date NOT NULL,
    arrive time NOT NULL,
    depart time NOT NULL
);

CREATE TABLE horaire_semaine(
    id_emp INT REFERENCES employe(id_emp),
    debut date NOT NULL,
    fin date NOT NULL,
    heure_nuit DOUBLE PRECISION NOT NULL,
    heure_weekend DOUBLE PRECISION NOT NULL,
    heure_ferier DOUBLE PRECISION NOT NULL
);

