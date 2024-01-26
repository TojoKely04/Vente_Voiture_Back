package com.projetS5.back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="annonceaccepter")
public class AnnoncesAccepter {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idAnnonceAccepte ;

    @ManyToOne
    @JoinColumn(name="idannonces")
    private Annonces annonces;

    public AnnoncesAccepter() {
    }

    public AnnoncesAccepter(Long idAnnonceAccepter, Annonces annonces) {
        this.idAnnonceAccepte = idAnnonceAccepter;
        this.annonces = annonces;
    }

    public Long getIdAnnonceAccepte() {
        return idAnnonceAccepte;
    }

    public void setIdAnnonceAccepte(Long idAnnonceAccepter) {
        this.idAnnonceAccepte = idAnnonceAccepter;
    }

    public Annonces getAnnonces() {
        return annonces;
    }

    public void setAnnonces(Annonces annonces) {
        this.annonces = annonces;
    }

    @Override
    public String toString() {
        return "AnnoncesAccepter [idAnnonceAccepte=" + idAnnonceAccepte + ", annonces=" + annonces + "]";
    } 
    
}
