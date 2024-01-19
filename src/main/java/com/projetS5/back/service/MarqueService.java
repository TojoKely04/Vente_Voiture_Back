package com.projetS5.back.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetS5.back.model.Marque;
import com.projetS5.back.repository.MarqueRepository;

@Service
public class MarqueService {
    
    @Autowired
    public MarqueRepository marqueRepository;

    public List<Marque> findAll() {
        return marqueRepository.findAll();
    }

    public Optional<Marque> findById(Long id) {
        return marqueRepository.findById(id);
    }

    public Marque save(Marque marque) {
        return marqueRepository.save(marque);
    }

    public void deleteById(Long id) {
        marqueRepository.deleteById(id);
    }
}
