package com.projetS5.back.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetS5.back.model.Categorie;
import com.projetS5.back.repository.CategorieRepository;

@Service
public class CategorieService {
    
    @Autowired
    public CategorieRepository categorieRepository;

    public List<Categorie> findAll(){
        return categorieRepository.findAll();
    }

    public Optional<Categorie> findById(Long id){
        return categorieRepository.findById(id);
    }

    public Categorie save(Categorie c) {
        return categorieRepository.save(c);
    }

    public void deleteById(Long id){
        categorieRepository.deleteById(id);
    }
}
