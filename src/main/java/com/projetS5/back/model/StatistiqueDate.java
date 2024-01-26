package com.projetS5.back.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StatistiqueDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dates")
    Date dates;
    @Column(name = "nombre_annonces")
    double nombrennonces;
    
    public StatistiqueDate( Date dates, double nombrennonces) {
       
        this.dates = dates;
        this.nombrennonces = nombrennonces;
    }
    public StatistiqueDate() {
    }
    public Date getDates() {
        return dates;
    }
    public double getNombrennonces() {
        return nombrennonces;
    }
    public void setNombrennonces(double nombrennonces) {
        this.nombrennonces = nombrennonces;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

}
