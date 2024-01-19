package com.projetS5.back.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vitesse")
public class BoiteVitesse{
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	Long idVitesse; 
	String vitesse; 

	public BoiteVitesse(Long idVitesse, String vitesse) {
		this.idVitesse = idVitesse;
		this.vitesse = vitesse;
	}

	public BoiteVitesse(){}

	public Long getIdVitesse() {
		return idVitesse;
	}

	public void setIdVitesse(Long idVitesse) {
		this.idVitesse = idVitesse;
	}

	public String getVitesse() {
		return vitesse;
	}

	public void setVitesse(String vitesse) {
		this.vitesse = vitesse;
	}

	@Override
	public String toString() {
		return "BoiteVitesse [idVitesse=" + idVitesse + ", vitesse=" + vitesse + "]";
	}

}