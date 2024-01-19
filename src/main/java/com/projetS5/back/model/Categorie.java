package com.projetS5.back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categorie{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idCategorie ; 
	String categorie ; 

	public Categorie(Long idCategorie, String categorie) {
		this.idCategorie = idCategorie;
		this.categorie = categorie;
	}

	public Categorie(){}

	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", categorie=" + categorie + "]";
	}

    
}