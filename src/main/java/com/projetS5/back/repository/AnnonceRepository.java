package com.projetS5.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetS5.back.model.Annonces;

@Repository
public interface AnnonceRepository extends JpaRepository<Annonces, Long> {

}
