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

import com.projetS5.back.model.AnnoncesRefuser;
import com.projetS5.back.service.AnnoncesRefuserService;

@RestController
@RequestMapping("/annoncesRefuser")
public class AnnoncesRefuserController {
    
    @Autowired
    private AnnoncesRefuserService annoncesRefuser ; 

    @GetMapping
    public List<AnnoncesRefuser> findAll(){
        return annoncesRefuser.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnnoncesRefuser> findById (@PathVariable Long id){
        return ResponseEntity.ok(annoncesRefuser.findById(id));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public AnnoncesRefuser create (@RequestBody AnnoncesRefuser annonces){
        return annoncesRefuser.save(annonces);
    }

    public AnnoncesRefuser update (@RequestBody AnnoncesRefuser annonces){
        return annoncesRefuser.save(annonces);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        annoncesRefuser.deleteById(id);
    }
    
}
