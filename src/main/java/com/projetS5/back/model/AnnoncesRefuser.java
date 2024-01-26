package com.projetS5.back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "annoncerefuser")
public class AnnoncesRefuser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAnnonceRefuser; 
    
    @ManyToOne
    @JoinColumn(name="idannonces")
    private Annonces annonces; 

    public AnnoncesRefuser(){}

    public AnnoncesRefuser(Long idAnnoncesRefuser,  Annonces annonces){
        this.idAnnonceRefuser= idAnnoncesRefuser ; 
        this.annonces = annonces; 
    }

    public Long getAnnonceRefuser(){
        return idAnnonceRefuser;
    }

    public void setIdAnnonceRefuser(Long idAnnoncesRefuser){
        this.idAnnonceRefuser= idAnnoncesRefuser; 
    }

    public Long getIdAnnonceRefuser() {
        return idAnnonceRefuser;
    }


    public Annonces getAnnonces() {
        return annonces;
    }

    public void setAnnonces(Annonces annonces) {
        this.annonces = annonces;
    }


}