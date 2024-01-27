package com.projetS5.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetS5.back.model.StatiqueMarque;
import com.projetS5.back.repository.StatiqueMarqueRepository;

@Service
public class StatiqueMarqueService {

    @Autowired
    private StatiqueMarqueRepository statiqueMarqueRepository;
    
    public StatiqueMarqueService(StatiqueMarqueRepository statiqueMarqueRepository) {
        this.statiqueMarqueRepository = statiqueMarqueRepository;
    }

    public List<StatiqueMarque> getAllIdMarqueVendu() {
        return statiqueMarqueRepository.getAllIdMarqueVendu();
    }

    public List<StatiqueMarque> getAll() {
        return statiqueMarqueRepository.findAll();
    }
}