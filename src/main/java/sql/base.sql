Create database voiture ; 
\c voiture ; 

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

create table categorie (
    idCategorie serial PRIMARY KEY, 
    categorie varchar(200)
);

Create table marque (
    idMarque serial PRIMARY KEY, 
    marque varchar(200)
); 

create table couleur (
    idCouleur serial PRIMARY KEY , 
    couleur varchar(200)
);

create table moteur (
    idMoteur serial PRIMARY KEY, 
    Moteur varchar(200)
);

create table vitesse (
    idVitesse serial PRIMARY KEY, 
    vitesse varchar(200)
);

create table energie (
    idEnergie serial PRIMARY KEY, 
    energie varchar(200)
);

create table moteur (
    idMoteur serial PRIMARY KEY, 
    moteur varchar(200)
);

create table annonces(
    idAnnonces serial PRIMARY KEY , 
    idUtilisateur int , 
    nom varchar (200), 
    descriptions varchar(200), 
    idCategorie int, 
    idMarque int, 
    idCouleur int, 
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
    FOREIGN KEY (idCouleur) REFERENCES couleur(idCouleur), 
    FOREIGN KEY (idMarque) REFERENCES marque(idMarque), 
    FOREIGN KEY (idCategorie) REFERENCES categorie(idCategorie),
    FOREIGN KEY (idUtilisateur) REFERENCES utilisateur(idUtilisateur)
) ; 

create table AnnonceAccepter(
    idAnnonceAccepte serial PRIMARY KEY , 
    idAnnonces int , 
    FOREIGN KEY (idAnnonces) REFERENCES annonces(idAnnonces)
);

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