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
    Long idannoncevendu;
    @Column(name = "dates")
    Date dates;
    @Column(name = "countannoncevendu")
    double countannoncevendu;
    
    public StatistiqueDate(Long idannoncevendu, Date dates, double countannoncevendu) {
        this.idannoncevendu = idannoncevendu;
        this.dates = dates;
        this.countannoncevendu = countannoncevendu;
    }
    public StatistiqueDate() {
    }
    public Long getIdannoncevendu() {
        return idannoncevendu;
    }
    public void setIdannoncevendu(Long idannoncevendu) {
        this.idannoncevendu = idannoncevendu;
    }
    public Date getDates() {
        return dates;
    }
    public void setDates(Date dates) {
        this.dates = dates;
    }
    public double getCountannoncevendu() {
        return countannoncevendu;
    }
    public void setCountannoncevendu(double countannoncevendu) {
        this.countannoncevendu = countannoncevendu;
    }

}
