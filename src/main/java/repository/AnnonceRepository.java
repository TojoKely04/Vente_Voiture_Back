package service;

import model.Annonces;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnnonceRepository extends JpaRepository<Annonces, Long> {
    List<Annonces> findByEtatNot(Integer etat);
    Annonces findByIdAnnonceAndEtatNot(Long id, Integer etat);
}
