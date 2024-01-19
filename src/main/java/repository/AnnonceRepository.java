package org.project.clouds5_backend.repository;

import org.project.clouds5_backend.model.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnnonceRepository extends JpaRepository<Annonces, String> {
    List<Annonces> findByEtatNot(Integer etat);
    Annonces findByIdAnnonceAndEtatNot(String id, Integer etat);
}
