package com.projetS5.back.controller;

import com.projetS5.back.model.Annonces;
import com.projetS5.back.service.AnnoncesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/annonces")
public class AnnoncesController {

    @Autowired
    private AnnoncesService annoncesService;

    @GetMapping
    public List<Annonces> findAll() {
        return annoncesService.findAll();
    }

    @GetMapping("/nonLus")
    public List<Annonces> getAnnoncesNonLus() {
        return annoncesService.getAnnoncesNonLus();
    }

    @GetMapping("/{id}")
    public Annonces findById(@PathVariable Long id) {
        return annoncesService.findById(id);
    }

    // create a book
    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping
    public Annonces create(@RequestBody Annonces book) {
        return annoncesService.save(book);
    }

    // update a book
    @PutMapping
    public Annonces update(@RequestBody Annonces book) {
        return annoncesService.save(book);
    }

    // delete a book
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        annoncesService.deleteById(id);
    }

}
