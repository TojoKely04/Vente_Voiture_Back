package com.projetS5.back.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetS5.back.model.Energie;
import com.projetS5.back.repository.EnergieRepository;

@Service
public class EnergieService {
    
    @Autowired 
    public EnergieRepository energieRepository;

    public List<Energie> findAll() {
        return energieRepository.findAll();
    }

    public Optional<Energie> findById(Long id) {
        return energieRepository.findById(id);
    }

    public Energie save(Energie e) {
        return energieRepository.save(e);
    }

    public void deleteById(Long id) {
        energieRepository.deleteById(id);
    }
}
