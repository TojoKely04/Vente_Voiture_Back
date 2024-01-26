package com.projetS5.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projetS5.back.model.StatistiquePrix;

@Repository

public interface StatistiquePrixRepository extends JpaRepository <StatistiquePrix, Double>{
     @Query(value = "select *from  statistiqueprix", nativeQuery = true)
    List<StatistiquePrix> getAllPrix();


    
}
