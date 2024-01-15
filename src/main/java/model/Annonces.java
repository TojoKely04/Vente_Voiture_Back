package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import Connection.Co;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Annonces
 */
public class Annonces {
    @Id
    @GeneratedValue(strategy = GenerationType.Auto)
    Long idAnnonce;
    Long idUtilisateur;
    String nom;
    String description;
    Long idCategorie;
    Long idMarque;
    Long idCouleur;
    Long idMoteur;
    Date annee;
    Long idBoiteVitesse;
    Long idEnergie;
    double prix;
    Date datePublication;

    public Annonces(){}

    public Annonces(Long idAnnonce , Long idUtilisateur , String nom , String description , Long idCategorie , Long idMarque , Long idCouleur , Long idMoteur , Date annee , Long idBoiteVitesse , Long idEnergie , double prix , Date datePublication ){
        this.idAnnonce = idAnnonce;
        this.idUtilisateur = idUtilisateur;
        this.nom = nom;
        this.description = description;
        this.idCategorie = idCategorie;
        this.idMarque = idMarque;
        this.idCouleur= idCouleur;
        this.idMoteur = idMoteur;
        this.annee = annee;
        this.idBoiteVitesse = idBoiteVitesse;
        this.idEnergie = idEnergie;
        this.prix = prix;
        this.datePublication = datePublication;
    }

    @Override
    public String toString(){
        return "Annonces {"+ 
            "idAnnonce ="+idAnnonce+
            ",idUtilisateur =" +idUtilisateur+
            ",nom='" + nom+"'"+
            ",description='" + description+"' "+
            ",idCategorie=" +idCategorie+
            ",idMarque=" +idMarque+
            ",idCouleur=" +idCouleur+
            ",annee=" +annee+
            ",idBoiteVitesse=" +idBoiteVitesse+
            ",idEnergie=" +idEnergie+
            ",prix=" +prix+
        '}' ;
    }

    public Long getIdAnnonce() {
        return idAnnonce;
    }
    public void setIdAnnonce(Long idAnnonce) {
        this.idAnnonce = idAnnonce;
    }

    public Long getIdUtilisateur() {
        return idUtilisateur;
    }
    public void setIdUtilisateur(Long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Long getIdCategorie() {
        return idCategorie;
    }
    public void setIdCategorie(Long idCategorie) {
        this.idCategorie = idCategorie;
    }

    public Long getIdMarque() {
        return idMarque;
    }
    public void setIdMarque(Long idMarque) {
        this.idMarque = idMarque;
    }

    public Long getIdCouleur() {
        return idCouleur;
    }
    public void setIdCouleur(Long idCouleur) {
        this.idCouleur = idCouleur;
    }

    public Long getIdMoteur() {
        return idMoteur;
    }
    public void setIdMoteur(Long idMoteur) {
        this.idMoteur = idMoteur;
    }

    public Date getAnnee() {
        return annee;
    }
    public void setAnnee(Date annee) {
        this.annee = annee;
    }

    public Long getidBoiteVitesse() {
        return idBoiteVitesse;
    }
    public void setidBoiteVitesse(Long idBoiteVitesse) {
        this.idBoiteVitesse = idBoiteVitesse;
    }

    public Long getIdEnergie() {
        return idEnergie;
    }
    public void setIdEnergie(Long idEnergie) {
        this.idEnergie = idEnergie;
    }

    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Date getDatePublication() {
        return datePublication;
    }
    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public void supprimer() throws Exception {
        Connection connection = Co.getConnection();
        String sql = "delete from annonces where idAnnonces=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, this.getIdAnnonce());
        int rowsAffected = statement.executeUpdate();

        statement.close();
        connection.close();
    }

    public void modifier() throws Exception {
        Connection connection = Co.getConnection();
        String sql = "UPDATE annonces SET idUtilisateur =? ,nom = ?,description = ?,idCategorie = ?,idMarque = ?,idCouleur= ?,idMoteur = ?,annee = ?,idBoiteVitesse = ?,idEnergie = ?,prix = ?,datePublication = ? WHERE idAnnonces=?  ";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, this.getIdUtilisateur());
        statement.setString(2, this.getNom());
        statement.setString(3, this.getDescription());
        statement.setLong(4, this.getIdCategorie());
        statement.setLong(5, this.getIdMarque());
        statement.setLong(6, this.getIdCouleur());
        statement.setLong(7, this.getIdMoteur());
        statement.setDate(8, this.getAnnee());
        statement.setLong(9, this.getidBoiteVitesse());
        statement.setLong(10, this.getIdEnergie());
        statement.setDouble(11, this.getPrix());
        statement.setDate(12, this.getDatePublication());
        statement.setLong(13, this.getIdAnnonce());
        int rowsAffected = statement.executeUpdate();

        statement.close();
        connection.close();

    }

    public void insert() throws Exception {
        Connection connection = Co.getConnection();
        String sql = "insert into annonces (idUtilisateur,nom,description,idCategorie,idMarque,idCouleur,idMoteur,annee,idBoiteVitesse,idEnergie,prix,datePublication)VALUES( ?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        // Set the values of the parameters
        statement.setLong(1, this.getIdUtilisateur());
        statement.setString(2, this.getNom());
        statement.setString(3, this.getDescription());
        statement.setLong(4, this.getIdCategorie());
        statement.setLong(5, this.getIdMarque());
        statement.setLong(6, this.getIdCouleur());
        statement.setLong(7, this.getIdMoteur());
        statement.setDate(8, this.getAnnee());
        statement.setLong(9, this.getidBoiteVitesse());
        statement.setLong(10, this.getIdEnergie());
        statement.setDouble(11, this.getPrix());
        statement.setDate(12, this.getDatePublication());
        

        // Execute the SQL statement
        int rowsAffected = statement.executeUpdate();

        // Close the connection
        statement.close();
        connection.close();
    }


}