package com.projetS5.back.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="annoncevendu")
public class AnnoncesVendues {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idannoncevendu;

    @ManyToOne
    @JoinColumn(name="idannonces")
    private Annonces annonces;

    Date dates;

    public AnnoncesVendues(Long idannoncevendu, Annonces annonces, Date dates) {
        this.idannoncevendu = idannoncevendu;
        this.annonces = annonces;
        this.dates = dates;
    }

    public AnnoncesVendues() {
    }

    public Long getIdannoncevendu() {
        return idannoncevendu;
    }

    public void setIdannoncevendu(Long idannoncevendu) {
        this.idannoncevendu = idannoncevendu;
    }

    public Annonces getAnnonces() {
        return annonces;
    }

    public void setAnnonces(Annonces annonces) {
        this.annonces = annonces;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

   
    
}
