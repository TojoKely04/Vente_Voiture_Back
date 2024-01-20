package com.projetS5.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projetS5.back.model.StatiqueMarque;

@Repository
public interface StatiqueMarqueRepository extends JpaRepository<StatiqueMarque, Long> {

    @Query(value = "select *from  annonces_vendes", nativeQuery = true)
    List<StatiqueMarque> getAllIdMarqueVendu();

}
