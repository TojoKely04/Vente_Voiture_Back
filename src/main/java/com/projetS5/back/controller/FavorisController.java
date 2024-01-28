package com.projetS5.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetS5.back.model.Annonces;
import com.projetS5.back.model.Favoris;
import com.projetS5.back.model.Utilisateur;
import com.projetS5.back.service.FavorisService;

@RestController
@RequestMapping("/favoris")
public class FavorisController {
    @Autowired 
    private  FavorisService favorisService;

    @PostMapping ("/Favoris/{idUser}/{idAnnonces}")
    public Favoris save(@PathVariable Long idUser, @PathVariable Long idAnnonces){
        Utilisateur u = new Utilisateur(); 
        u.setIdUtilisateur(idUser);
        Annonces a = new Annonces(); 
        a.setIdAnnonce(idAnnonces);
        Favoris favoris = new Favoris(); 
        favoris.setUser(u);
        favoris.setAnnonce(a);
        return favorisService.save(favoris);
    }
}
