package com.projetS5.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetS5.back.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur , Long>{
    
}
