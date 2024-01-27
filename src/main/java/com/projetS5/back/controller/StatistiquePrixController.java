package com.projetS5.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetS5.back.model.StatistiquePrix;
import com.projetS5.back.service.StatistiquePrixService;

@RestController
@RequestMapping("/StatPrix")
public class StatistiquePrixController {
    @Autowired
    private StatistiquePrixService prixService;

    @GetMapping
    public  java.util.List<StatistiquePrix> getAllPrix(){
        return prixService.getAllPrix();
    }
    
}
