package com.projetS5.back.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.projetS5.back.model.Annonces;
import com.projetS5.back.model.AnnoncesVendues;
import com.projetS5.back.service.AnnoncesVenduesService;

@RestController
@RequestMapping("/vendre")
public class AnnoncesVenduesController {
    @Autowired
    private AnnoncesVenduesService annoncesVenduesService;

    @GetMapping
    public List<AnnoncesVendues> findAll(){
        return annoncesVenduesService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnnoncesVendues> findById (@PathVariable Long id){
        return ResponseEntity.ok(annoncesVenduesService.findById(id));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public AnnoncesVendues create (@RequestBody AnnoncesVendues annonces){
        return annoncesVenduesService.save(annonces);
    }

    @PutMapping
    public AnnoncesVendues update (@RequestBody AnnoncesVendues annonces){
        return annoncesVenduesService.save(annonces);
    }
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        annoncesVenduesService.deleteById(id);
    }
    
    @PostMapping("/{id}")
    public AnnoncesVendues getAnnoncesUtilisateurs(@PathVariable Long id) {
        Annonces a = new Annonces();
        a.setIdAnnonce(id);
        AnnoncesVendues av = new AnnoncesVendues();
        av.setAnnonces(a);
        av.setDates(Date.valueOf(LocalDate.now()));
        return annoncesVenduesService.save(av);
    }
}
