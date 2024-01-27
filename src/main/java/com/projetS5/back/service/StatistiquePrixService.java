package com.projetS5.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetS5.back.model.StatistiquePrix;
import com.projetS5.back.repository.StatistiquePrixRepository;

@Service
public class StatistiquePrixService {
    @Autowired
    private StatistiquePrixRepository statistiquePrixRepository;
    
    public StatistiquePrixService(StatistiquePrixRepository statistiquePrixRepository) {
        this.statistiquePrixRepository = statistiquePrixRepository;
    }
    public List<StatistiquePrix> getAllPrix(){
        return statistiquePrixRepository.getAllPrix();
    }
    public List<StatistiquePrix> getAll(){
        return statistiquePrixRepository.findAll();
    }
    

}
