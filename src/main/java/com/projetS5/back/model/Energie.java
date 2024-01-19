package com.projetS5.back.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Energie{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idEnergie ; 
	String energie ; 

	public Energie(){}

	public Energie(Long idEnergie , String energie){
		this.idEnergie= idEnergie ; 
		this.energie= energie; 
	}

	@Override
	public String toString(){
		return "Energie { " +
		"id= "+idEnergie+ 
		" energie = " +energie+ '}';
	}

	public Long getIdEnergie() {
        return idEnergie;
    }

    public void setIdEnergie(Long idEnergie) {
        this.idEnergie = idEnergie;
    }

    public String getenergie() {
        return energie;
    }

    public void setenergie(String energie) {
        this.energie = energie;
    }
}