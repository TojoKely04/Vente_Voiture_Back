package com.projetS5.back.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetS5.back.model.BoiteVitesse;
import com.projetS5.back.repository.BoiteVitesseRepository;

@Service
public class BoiteVitesseService {

    @Autowired
    public BoiteVitesseRepository boiteVitesseRepository;

    public List<BoiteVitesse> findAll(){
        return boiteVitesseRepository.findAll();
    }

    public Optional<BoiteVitesse> findById(Long id){
        return boiteVitesseRepository.findById(id);
    }    

    public BoiteVitesse save(BoiteVitesse boite) {
        return boiteVitesseRepository.save(boite);
    }

    public void deleteById(Long id){
        boiteVitesseRepository.deleteById(id);
    }

}
