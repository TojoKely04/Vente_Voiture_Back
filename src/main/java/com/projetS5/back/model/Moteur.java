package com.projetS5.back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Moteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idMoteur;
    String moteur;

    public Moteur(){}

    public Moteur(Long idMoteur, String moteur) {
        this.idMoteur = idMoteur;
        this.moteur = moteur;
    }
    public Long getIdMoteur() {
        return idMoteur;
    }
    public void setIdMoteur(Long idMoteur) {
        this.idMoteur = idMoteur;
    }
    public String getMoteur() {
        return moteur;
    }
    public void setMoteur(String moteur) {
        this.moteur = moteur;
    }
    @Override
    public String toString() {
        return "Moteur [idMoteur=" + idMoteur + ", moteur=" + moteur + "]";
    }

    
}
