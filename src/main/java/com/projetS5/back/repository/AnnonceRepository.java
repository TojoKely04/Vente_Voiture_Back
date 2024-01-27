package com.projetS5.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projetS5.back.model.Annonces;

public interface AnnonceRepository extends JpaRepository<Annonces, Long> {
    @Query(value = "select *from  AnnoncesNonLues", nativeQuery = true)
    List<Annonces> getAnnoncesNonLus();
}
