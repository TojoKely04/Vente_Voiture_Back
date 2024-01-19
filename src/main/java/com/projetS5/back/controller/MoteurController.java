package com.projetS5.back.controller;

import com.projetS5.back.model.Moteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.projetS5.back.service.MoteurService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/moteur")
public class MoteurController {

    @Autowired
    private MoteurService moteurService;

    @GetMapping
    public List<Moteur> findAll() {
        return moteurService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Moteur> findById(@PathVariable Long id) {
        return moteurService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Moteur create(@RequestBody Moteur moteur) {
        return moteurService.save(moteur);
    }

    @PutMapping
    public Moteur update(@RequestBody Moteur moteur) {
        return moteurService.save(moteur);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        moteurService.deleteById(id);
    }
}
