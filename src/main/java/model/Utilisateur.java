package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utilisateur{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	Long idUtilisateur; 
	String nom; 
	String prenom; 
	String email; 
	String adresse; 
	String passwords; 
	int contact; 
	Boolean isAdmin ; 

	public Utilisateur(Long idUtilisateur, String nom, String prenom, String email, String adresse, String passwords,
            int contact, Boolean isAdmin) {
        this.idUtilisateur = idUtilisateur;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.passwords = passwords;
        this.contact = contact;
        this.isAdmin = isAdmin;
    }

    public Utilisateur(){}

	@Override
	public String toString (){
		return "Utilisateur {"+
			"id=" +idUtilisateur +
			", nom=" +nom+ 
			", prenom= " +prenom+
			", email= " +email+
			", adresse = " +adresse+
			" , password= " +passwords+
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

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
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