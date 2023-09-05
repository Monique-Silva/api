DROP TABLE IF EXISTS voitures;

CREATE TABLE voitures (
                           id INT AUTO_INCREMENT  PRIMARY KEY,
                           marque VARCHAR(250) NOT NULL,
                           modele VARCHAR(250) NOT NULL,
                           couleur VARCHAR(250) NOT NULL,
);

INSERT INTO voitures (marque, modele, couleur) VALUES
                                                                  ('Audi', 'A7', 'noir'),
                                                                  ('Audi', 'A8', 'blanc'),
                                                                  ('Renault', 'Clio', 'bleu'),
                                                                  ('Renault', 'Espace', 'gris'),
                                                                  ('Peugeot', '208', 'blanc');