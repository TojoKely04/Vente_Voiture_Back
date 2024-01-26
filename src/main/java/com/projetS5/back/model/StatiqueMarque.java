package com.projetS5.back.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StatiqueMarque {
    @Id
    @Column(name="idmarque")
    Long idMarque;

    @Column(name = "count")
    double countMarque;

    @Column(name = "marque")
    String marque;

    public StatiqueMarque(Long idMarque, double countMarque, String marque) {
        this.idMarque = idMarque;
        this.countMarque = countMarque;
        this.marque = marque;
    }

    public StatiqueMarque() {
    }

    public Long getIdMarque() {
        return idMarque;
    }

    public void setIdMarque(Long idMarque) {
        this.idMarque = idMarque;
    }

    public double getCountMarque() {
        return countMarque;
    }

    public void setCountMarque(double countMarque) {
        this.countMarque = countMarque;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
}
