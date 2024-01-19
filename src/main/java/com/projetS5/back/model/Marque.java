package com.projetS5.back.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Marque{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idMarque ; 
	String marque ; 

	public Marque(){}

	public Marque(Long idMarque , String marque){
		this.idMarque= idMarque ; 
		this.marque= marque; 
	}

	@Override
	public String toString(){
		return "Marque { " +
		"id= "+idMarque+ 
		" marque = " +marque+ '}';
	}

	public Long getIdMarque() {
        return idMarque;
    }

    public void setIdMarque(Long idMarque) {
        this.idMarque = idMarque;
    }

    public String getmarque() {
        return marque;
    }

    public void setmarque(String marque) {
        this.marque = marque;
    }

}