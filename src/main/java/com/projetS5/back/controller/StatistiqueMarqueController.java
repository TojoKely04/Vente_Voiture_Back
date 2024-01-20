package com.projetS5.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetS5.back.model.StatiqueMarque;
import com.projetS5.back.service.AnnoncesService;
import com.projetS5.back.service.StatiqueMarqueService;

@RestController
@RequestMapping("/stat")
public class StatistiqueMarqueController {
    @Autowired
    private StatiqueMarqueService marqueService;

    @GetMapping("/{id}/vendu")
    public java.util.List<StatiqueMarque> getAllIdMarqueVendu() {
        return marqueService.getAllIdMarqueVendu();
    }
}
