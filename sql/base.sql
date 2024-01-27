Create database voiture ; 
\c voiture 

create table utilisateur (
    idUtilisateur serial PRIMARY KEY, 
    nom varchar (200), 
    prenom varchar(200), 
    email varchar(200), 
    adresse varchar(200), 
    passwords varchar(200), 
    contact int , 
    isAdmin boolean 
);
INSERT INTO utilisateur VALUES(default , 'Randria' , 'Tojo', 'tojo@gmail.com' , 'Andravoahangy' , 'tojo', 123456789 , true);
INSERT INTO utilisateur VALUES(default , 'Nomenjanahary' , 'Rova', 'rova@gmail.com' , 'Tanjombato' , 'rova', 123456789 , false);
INSERT INTO utilisateur VALUES(default , 'Rasoanaivo' , 'Ilo', 'ilo@gmail.com' , 'Andravoahangy' , 'tojo', 123456789 , false);
INSERT INTO utilisateur VALUES(default , 'Rakoto' , 'Ilo', 'ilo@gmail.com' , 'Andravoahangy' , 'tojo', 123456789 , false);

create table categorie (
    idCategorie serial PRIMARY KEY, 
    categorie varchar(200)
);
INSERT INTO categorie VALUES (default, 'Lourd');
INSERT INTO categorie VALUES (default, 'Leger');
INSERT INTO categorie VALUES (default, 'Familiale');


Create table marque (
    idMarque serial PRIMARY KEY, 
    marque varchar(200)
); 
INSERT INTO marque VALUES (default , 'Renault');
INSERT INTO marque VALUES (default , 'Merco');
INSERT INTO marque VALUES (default , 'Subaru');

create table moteur (
    idMoteur serial PRIMARY KEY, 
    Moteur varchar(200)
);
INSERT INTO moteur VALUES(default , '1 6');
INSERT INTO moteur VALUES(default , '1 9');
INSERT INTO moteur VALUES(default , '2 L');

create table vitesse (
    idVitesse serial PRIMARY KEY, 
    vitesse varchar(200)
);
INSERT INTO vitesse VALUES (default , 'Automatique');
INSERT INTO vitesse VALUES (default , 'Manuel');

create table energie (
    idEnergie serial PRIMARY KEY, 
    energie varchar(200)
);
INSERT INTO energie VALUES(default , 'Diesel');
INSERT INTO energie VALUES(default , 'Essence');

create table annonces(
    idAnnonces serial PRIMARY KEY , 
    idUtilisateur int , 
    nom varchar (200), 
    descriptions varchar(200), 
    idCategorie int, 
    idMarque int, 
    couleur VARCHAR(255), 
    idMoteur int, 
    anneeSortie date , 
    idVitesse int , 
    idEnergie int , 
    prix double precision,
    images varchar(200) ,
    datePublication date ,  

    FOREIGN KEY (idEnergie) REFERENCES energie(idEnergie), 
    FOREIGN KEY (idVitesse) REFERENCES vitesse(idVitesse), 
    FOREIGN KEY (idMoteur) REFERENCES moteur(idMoteur),
    FOREIGN KEY (idMarque) REFERENCES marque(idMarque), 
    FOREIGN KEY (idCategorie) REFERENCES categorie(idCategorie),
    FOREIGN KEY (idUtilisateur) REFERENCES utilisateur(idUtilisateur)
) ; 
INSERT INTO annonces VALUES (default , 2 , 'Voiture 1' , 'Description 1' , 1 , 1 , 'Rouge' , 1 , '01-01-2012' , 1 , 1 , 2000, 'Image 1' , '2023-01-19');
INSERT INTO annonces VALUES (default , 3 , 'Voiture 2' , 'Description 2' , 2 , 2 , 'Bleu' , 2 , '01-01-2012' , 2 , 2 , 2000, 'Image 2' , '2023-01-19');
INSERT INTO annonces VALUES (default , 3 , 'Voiture 3' , 'Description 3' , 2 , 2 , 'Noir' , 2 , '01-01-2012' , 2 , 2 , 2000, 'Image 2' , '2023-01-19');

create table AnnonceAccepter(
    idAnnonceAccepte serial PRIMARY KEY , 
    idAnnonces int , 
    FOREIGN KEY (idAnnonces) REFERENCES annonces(idAnnonces)
);
INSERT INTO AnnonceAccepter VALUES(default,10);
INSERT INTO AnnonceAccepter VALUES(default,2);


create table AnnonceRefuser(
    idAnnonceRefuser serial PRIMARY KEY , 
    idAnnonces int , 
    FOREIGN KEY (idAnnonces) REFERENCES annonces(idAnnonces)
);
-------------------------------------------------------------------------
CREATE VIEW AnnoncesNonLues AS
SELECT * FROM Annonces where 
idAnnonces not in(SELECT idAnnonces from AnnonceRefuser) and 
idAnnonces not in (SELECT idAnnonces from AnnonceAccepter);  

create table annonces(
    idAnnonces serial PRIMARY KEY , 
    idUtilisateur int , 
    nom varchar (200), 
    descriptions varchar(200), 
    idCategorie int, 
    idMarque int, 
    couleur VARCHAR(255), 
    idMoteur int, 
    anneeSortie date , 
    idVitesse int , 
    idEnergie int , 
    prix double precision,
    images varchar(200) ,
    datePublication date ,  

    FOREIGN KEY (idEnergie) REFERENCES energie(idEnergie), 
    FOREIGN KEY (idVitesse) REFERENCES vitesse(idVitesse), 
    FOREIGN KEY (idMoteur) REFERENCES moteur(idMoteur),
    FOREIGN KEY (idMarque) REFERENCES marque(idMarque), 
    FOREIGN KEY (idCategorie) REFERENCES categorie(idCategorie),
    FOREIGN KEY (idUtilisateur) REFERENCES utilisateur(idUtilisateur)
) ; 
-------------------------------------------------------------------------

create table historique (
    idHistorique serial PRIMARY KEY , 
    idUtilisateur int , 
    idAnnonces int, 

    FOREIGN KEY (idUtilisateur) REFERENCES utilisateur(idUtilisateur), 
    FOREIGN KEY (idAnnonces) REFERENCES Annonces(idAnnonces)
);
SELECT * FROM Annonces where idUtilisateur = 3;

SELECT Annonces.idUtilisateur,  Annonces.nom ,  Annonces.descriptions, Annonces.idCategorie , Annonces.idMarque, 
Annonces.couleur, Annonces.idMoteur, Annonces.anneeSortie , Annonces.idVitesse, Annonces.idEnergie , Annonces.prix, Annonces.images , Annonces.datePublication FROM Annonces join utilisateur 
on Annonces.idUtilisateur = utilisateur.idUtilisateur where utilisateur.idUtilisateur=3; 

--------------------------------------------------------------------------
create table favoris (
    idFavoris serial PRIMARY KEY, 
    idUtilisateur int ,
    idAnnonces int, 
    FOREIGN KEY (idUtilisateur) REFERENCES utilisateur (idUtilisateur), 
    FOREIGN KEY (idAnnonces) REFERENCES annonces (idAnnonces) 
);
INSERT INTO favoris VALUES(default , 2 ,1);
INSERT INTO favoris VALUES(default , 3 ,2);
INSERT INTO favoris VALUES(default , 3 ,3);



create table AnnonceVendu (
    idAnnonceVendu serial PRIMARY KEY , 
    idAnnonces int , 
    FOREIGN KEY (idAnnonces) REFERENCES annonces(idAnnonces)
);
INSERT INTO AnnonceVendu VALUES(default , 1);
INSERT INTO annoncevendu VALUES(default , 2,'2016-01-17');
INSERT INTO annoncevendu VALUES(default , 2,'2016-01-17');


CREATE OR REPLACE VIEW annonces_vendus AS
SELECT m.idmarque, marq.marque, COUNT(m.idmarque)
FROM AnnonceVendu a
JOIN Annonces m ON a.idannonces = m.idannonces
JOIN Marque marq ON m.idmarque = marq.idmarque
WHERE a.idannoncevendu IS NOT NULL
GROUP BY m.idmarque, marq.marque;

select * from annonces_vendus;

CREATE VIEW statistiquePrix AS
SELECT a.prix, COUNT(av.idannoncevendu) AS countannoncevendu
FROM AnnonceVendu av
JOIN annonces a ON av.idannonces = a.idannonces
GROUP BY a.prix;


select * from statistiqueprix;   

alter table annoncevendu add Column dates date;
UPDATE annoncevendu set dates ='2015-05-15'; 

CREATE VIEW statistiqueDates AS
    SELECT dates, COUNT(dates) AS nombre_annonces
    FROM annoncevendu
    GROUP BY dates;

SELECT a.*
FROM annonces as a
JOIN favoris as f on a.idannonces = f.idannonces where a.idannonces = f.idannonces and a.idUtilisateur = 2;
