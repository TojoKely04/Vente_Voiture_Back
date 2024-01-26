package com.projetS5.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetS5.back.model.StatistiqueDate;
import com.projetS5.back.repository.StatistiqueDateRepository;

@Service
public class StatistiqueDateService {
    private StatistiqueDateRepository statistiqueDateRepository;
    @Autowired
    public StatistiqueDateService(StatistiqueDateRepository statistiqueDateRepository) {
        this.statistiqueDateRepository = statistiqueDateRepository;
    }
    public List<StatistiqueDate> getAllDate(){
        return statistiqueDateRepository.getAllDate();
    }
    public List<StatistiqueDate> getAll(){
        return statistiqueDateRepository.findAll();
    }


}
