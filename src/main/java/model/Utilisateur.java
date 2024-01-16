package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Connection.Co;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Utilisateur{
	Long idUtilisateur; 
	String nom; 
	String prenom; 
	String email; 
	String adresse ; 
	String password ; 
	int contact ; 
	Boolean isAdmin ; 

	public Utilisateur(){}

	public Utilisateur(Long idUtilisateur , String email , String password){
		this.idUtilisateur= idUtilisateur; 
		this.email = email ; 
		this.password = password; 
	}


	@Override
	public String toString (){
		return "Utilisateur {"+
			"id=" +idUtilisateur +
			", nom=" +nom+ 
			", prenom= " +prenom+
			", email= " +email+
			", adresse = " +adresse+
			" , password= " +password+
			", contact =" +contact+
			", isAdmin= " +isAdmin +
			'}';
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
        
        
}