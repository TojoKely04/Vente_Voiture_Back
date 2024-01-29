package com.projetS5.back.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "annoncesStatus")
public class AnnoncesStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idAnnonces")
    private Long idAnnonce;
    
    @ManyToOne
    @JoinColumn(name="idUtilisateur")
    private Utilisateur utilisateur;
    
    private String nom;
    
    private String descriptions;
    
    @ManyToOne
    @JoinColumn(name="idCategorie")
    private Categorie categorie;

    @ManyToOne
    @JoinColumn(name="idMarque")
    private Marque marque;

    private String couleur;

    @ManyToOne
    @JoinColumn(name="idMoteur")
    private Moteur moteur;

    private Date anneeSortie;

    @ManyToOne
    @JoinColumn(name="idVitesse")
    private BoiteVitesse boiteVitesse;
    
    @ManyToOne
    @JoinColumn(name="idEnergie")
    private Energie energie;
    
    private double prix;
    private String images;
    private Date datePublication;
    private double kilometrage;

    private int status;

    public AnnoncesStatus(Long idAnnonce, Utilisateur utilisateur, String nom, String descriptions, Categorie categorie,
            Marque marque, String couleur, Moteur moteur, Date anneeSortie, BoiteVitesse boiteVitesse, Energie energie,
            double prix, String images, Date datePublication, double kilometrage, int status) {
        this.idAnnonce = idAnnonce;
        this.utilisateur = utilisateur;
        this.nom = nom;
        this.descriptions = descriptions;
        this.categorie = categorie;
        this.marque = marque;
        this.couleur = couleur;
        this.moteur = moteur;
        this.anneeSortie = anneeSortie;
        this.boiteVitesse = boiteVitesse;
        this.energie = energie;
        this.prix = prix;
        this.images = images;
        this.datePublication = datePublication;
        this.kilometrage = kilometrage;
        this.status = status;
    }

    public AnnoncesStatus() {
    }

    public Long getIdAnnonce() {
        return idAnnonce;
    }

    public void setIdAnnonce(Long idAnnonce) {
        this.idAnnonce = idAnnonce;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    public Date getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(Date anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public BoiteVitesse getBoiteVitesse() {
        return boiteVitesse;
    }

    public void setBoiteVitesse(BoiteVitesse boiteVitesse) {
        this.boiteVitesse = boiteVitesse;
    }

    public Energie getEnergie() {
        return energie;
    }

    public void setEnergie(Energie energie) {
        this.energie = energie;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    

}
