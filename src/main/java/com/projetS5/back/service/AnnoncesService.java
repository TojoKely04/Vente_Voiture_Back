package com.projetS5.back.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetS5.back.model.Annonces;
import com.projetS5.back.repository.AnnonceRepository;

@Service
public class AnnoncesService {

    @Autowired
    private AnnonceRepository annonceRepository;


    public List<Annonces> findAll() {
        return annonceRepository.findAll();
    }

    public Annonces findById(Long id) {
        return annonceRepository.findById(id).orElse(null);
    }

    public Annonces save(Annonces book) {
        return annonceRepository.save(book);
    }

    public void deleteById(Long id) {
        annonceRepository.deleteById(id);
    }
    
}