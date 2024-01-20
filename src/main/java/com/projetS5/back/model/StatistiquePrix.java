package com.projetS5.back.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class StatistiquePrix {
    @Id


    @Column(name = "prix")
    double prix;


    // @Column(name = "countannoncevendu")
    double countannoncevendu;

    public StatistiquePrix( double prix , double countannoncevendu) {
        this.prix = prix;
        this.countannoncevendu = countannoncevendu;
    }
    public StatistiquePrix() {
    }

    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public double getCountannoncevendu() {
        return countannoncevendu;
    }
    public void setCountannoncevendu(double countannoncevendu) {
        this.countannoncevendu = countannoncevendu;
    }
    

    

}
