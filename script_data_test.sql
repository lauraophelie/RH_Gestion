-------------------------------- 08/10/23 ---------------------------------------

INSERT INTO entreprise(nom_entreprise, adresse) VALUES 
                        ('DIMPEX', 'ENCEINTE ITU ANDOHARANOFOTSY');

INSERT INTO departement(nom_dept, id_entreprise) VALUES
                        ('Informatique', 1),
                        ('Marketing', 1),
                        ('Comptabilité', 1),
                        ('Recherche', 1);

INSERT INTO domaine(designation) VALUES
                    ('Production'),
                    ('Import et Export');

INSERT INTO services(nom_service, id_dept, id_domaine) VALUES
                    ('Maintenance', 1, 2),
                    ('Admin. Système', 1, 2),
                    ('Architecture', 1, 2),
                    ('Développement', 1, 2),
                    ('Réseaux', 1, 2);

INSERT INTO poste(id_service, nom_poste, heure_jour) VALUES
                (4, 'Dév. Back-end', 8),
                (4, 'Dév. Front-end', 7),
                (4, 'Dév. Full Stack', 8);

----------

INSERT INTO besoin(id_poste, nombre, date_demande, date_limite) VALUES
                    (1, 25, now(), '2023-10-16');

----------