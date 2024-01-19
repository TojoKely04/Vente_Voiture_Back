package com.projetS5.back.controller;

import com.projetS5.back.model.Marque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.projetS5.back.service.MarqueService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marque")
public class MarqueController {

    @Autowired
    private MarqueService marqueService;

    @GetMapping
    public List<Marque> findAll() {
        return marqueService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Marque> findById(@PathVariable Long id) {
        return marqueService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Marque create(@RequestBody Marque marque) {
        return marqueService.save(marque);
    }

    @PutMapping
    public Marque update(@RequestBody Marque marque) {
        return marqueService.save(marque);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        marqueService.deleteById(id);
    }
}
