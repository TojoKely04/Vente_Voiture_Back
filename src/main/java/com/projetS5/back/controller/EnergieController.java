package com.projetS5.back.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.projetS5.back.model.Energie;
import com.projetS5.back.service.EnergieService;

@RestController
@RequestMapping("/energie")
public class EnergieController {

    @Autowired
    private EnergieService energieService;

    @GetMapping
    public List<Energie> findAll() {
        return energieService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Energie> findById(@PathVariable Long id) {
        return energieService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Energie create(@RequestBody Energie energie) {
        return energieService.save(energie);
    }

    @PutMapping
    public Energie update(@RequestBody Energie energie) {
        return energieService.save(energie);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        energieService.deleteById(id);
    }
}
