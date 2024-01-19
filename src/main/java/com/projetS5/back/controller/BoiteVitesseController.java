package com.projetS5.back.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.projetS5.back.model.BoiteVitesse;
import com.projetS5.back.service.BoiteVitesseService;

@RestController
@RequestMapping("/vitesse")
public class BoiteVitesseController {
    
    @Autowired
    private BoiteVitesseService boiteVitesseService;

    @GetMapping
    public List<BoiteVitesse> findAll() {
        return boiteVitesseService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<BoiteVitesse> findById(@PathVariable Long id){
        return boiteVitesseService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public BoiteVitesse create(@RequestBody BoiteVitesse boiteVitesse){
        return boiteVitesseService.save(boiteVitesse);
    }

    @PutMapping
    public BoiteVitesse update(@RequestBody BoiteVitesse boiteVitesse){
        return boiteVitesseService.save(boiteVitesse);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        boiteVitesseService.deleteById(id);
    }
}
