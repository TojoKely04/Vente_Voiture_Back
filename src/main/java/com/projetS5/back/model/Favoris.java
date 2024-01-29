package com.projetS5.back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "favoris")
public class Favoris {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFavoris;

    @ManyToOne
    @JoinColumn(name="idUtilisateur")
    private Utilisateur user;

    @ManyToOne
    @JoinColumn(name="idAnnonces")
    private Annonces annonce;

    public Favoris(long idFavoris, Utilisateur user, Annonces annonce) {
        this.idFavoris = idFavoris;
        this.user = user;
        this.annonce = annonce;
    }


    public Favoris(){}


    public long getIdFavoris() {
        return idFavoris;
    }

    public void setIdFavoris(long idFavoris) {
        this.idFavoris = idFavoris;
    }

    public Utilisateur getUser() {
        return user;
    }

    public void setUser(Utilisateur user) {
        this.user = user;
    }


    public Annonces getAnnonce() {
        return annonce;
    }


    public void setAnnonce(Annonces annonce) {
        this.annonce = annonce;
    }


    
}
