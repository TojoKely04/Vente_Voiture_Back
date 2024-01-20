package com.projetS5.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projetS5.back.model.Annonces;
import com.projetS5.back.model.StatiqueMarque;

public interface AnnonceRepository extends JpaRepository<Annonces, Long> {

}
