package com.projetS5.back.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projetS5.back.model.StatistiqueDate;


@Repository
public interface StatistiqueDateRepository extends JpaRepository<StatistiqueDate, Long> {
    @Query(value = "select * from statistiqueDates", nativeQuery = true)
    List<StatistiqueDate> getAllDate();

}
