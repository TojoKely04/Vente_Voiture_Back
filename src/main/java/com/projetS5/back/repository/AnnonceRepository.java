package com.projetS5.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.projetS5.back.model.Annonces;
import com.projetS5.back.model.Utilisateur;

public interface AnnonceRepository extends JpaRepository<Annonces, Long> {
    @Query(value = "select * from  AnnoncesNonLues", nativeQuery = true)
    List<Annonces> getAnnoncesNonLus();

    List<Annonces> findByutilisateur(Utilisateur utilisateur);

    @Query(value = "SELECT a.* FROM annonces as a JOIN favoris as f on a.idannonces = f.idannonces where a.idannonces = f.idannonces and a.idUtilisateur = :idUser",nativeQuery= true)
    List<Annonces> findFavorisByUser(@Param("idUser") Long idUser);
    
}


