package com.projetS5.back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.projetS5.back.model.AnnoncesAccepter;
import com.projetS5.back.service.AnnoncesAccepterService;

@RestController
@RequestMapping("/annoncesAccepter")
public class AnnoncesAccepterController {
    @Autowired
    private AnnoncesAccepterService annoncesAccepter;

    @GetMapping
    public List<AnnoncesAccepter> findAll(){
        return annoncesAccepter.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnnoncesAccepter> findById (@PathVariable Long id){
        return ResponseEntity.ok(annoncesAccepter.findById(id));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public AnnoncesAccepter create (@RequestBody AnnoncesAccepter annonces){
        return annoncesAccepter.save(annonces);
    }

    public AnnoncesAccepter update (@RequestBody AnnoncesAccepter annonces){
        return annoncesAccepter.save(annonces);
    }
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        annoncesAccepter.deleteById(id);
    }
    
}
