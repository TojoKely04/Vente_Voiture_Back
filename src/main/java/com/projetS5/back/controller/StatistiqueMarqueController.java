package com.projetS5.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetS5.back.model.StatiqueMarque;
import com.projetS5.back.service.StatiqueMarqueService;

@RestController
@RequestMapping("/StatMarque")
public class StatistiqueMarqueController {
    @Autowired
    private StatiqueMarqueService marqueService;

    @GetMapping
    public java.util.List<StatiqueMarque> getAllIdMarqueVendu() {
        return marqueService.getAllIdMarqueVendu();
    }
}
