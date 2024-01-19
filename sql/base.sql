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

create table AnnonceAccepter(
    idAnnonceAccepte serial PRIMARY KEY , 
    idAnnonces int , 
    FOREIGN KEY (idAnnonces) REFERENCES annonces(idAnnonces)
);
INSERT INTO AnnonceAccepter VALUES(default,1);
INSERT INTO AnnonceAccepter VALUES(default,2);

create table AnnonceRefuser(
    idAnnonceRefuser serial PRIMARY KEY , 
    idAnnonces int , 
    FOREIGN KEY (idAnnonces) REFERENCES annonces(idAnnonces)
);

create table favoris (
    idFavoris serial PRIMARY KEY, 
    idUtilisateur int ,
    idAnnonces int, 
    FOREIGN KEY (idUtilisateur) REFERENCES utilisateur (idUtilisateur), 
    FOREIGN KEY (idAnnonces) REFERENCES annonces (idAnnonces) 
);

create table AnnonceVendu (
    idAnnonceVendu serial PRIMARY KEY , 
    idAnnonces int , 
    FOREIGN KEY (idAnnonces) REFERENCES annonces(idAnnonces)
);
INSERT INTO AnnonceVendu VALUES(default , 1);