package com.projetS5.back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "annoncevendu")
public class AnnonceVendu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idannoncevendu;
    long idannonces;

    public AnnonceVendu(Long idannoncevendu, long idAnnonces) {
        this.idannoncevendu = idannoncevendu;
        this.idannonces = idAnnonces;
    }

    public AnnonceVendu() {
    }

    public Long getIdannoncevendu() {
        return idannoncevendu;
    }

    public void setIdannoncevendu(Long idannoncevendu) {
        this.idannoncevendu = idannoncevendu;
    }

    public long getIdAnnonces() {
        return idannonces;
    }

    public void setIdAnnonces(long idAnnonces) {
        this.idannonces = idAnnonces;
    }

}
