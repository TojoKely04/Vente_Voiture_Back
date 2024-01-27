package com.projetS5.back.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projetS5.back.model.StatistiqueDate;

public interface StatistiqueDateRepository extends JpaRepository<StatistiqueDate, Date> {
    @Query(value = "select * from statistiqueDates", nativeQuery = true)
    List<StatistiqueDate> getAllDate();

}
