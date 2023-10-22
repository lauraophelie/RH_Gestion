CREATE TABLE IF NOT EXISTS utilisateur(
    id SERIAL PRIMARY KEY,
    nom VARCHAR(75) NOT NULL,
    adresse_email VARCHAR(100) NOT NULL,
    mdp VARCHAR(10) NOT NULL,
    services INTEGER REFERENCES services(id_service)
);

INSERT INTO utilisateur(nom, adresse_email, mdp, services) VALUES
                        ('Annie', 'annie@admin.com', '0123456', 1),
                        ('Jean', 'jean@admin.com', '0123456', 2),
                        ('Aline', 'aline@admin.com', '0123456', 3);