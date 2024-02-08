package com.projetS5.back.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetS5.back.model.Annonces;
import com.projetS5.back.model.Favoris;
import com.projetS5.back.model.Utilisateur;
import com.projetS5.back.repository.UtilisateurRepository;
import com.projetS5.back.service.FavorisService;

@RestController
@RequestMapping("/favoris")
public class FavorisController {

    @Autowired 
    private  FavorisService favorisService;
    @Autowired
    private com.projetS5.back.config.JwtService jwtService;
    @Autowired
    private UtilisateurRepository repository;

    @PostMapping ("/{token}/{idAnnonces}")
    public Favoris save(@PathVariable String token, @PathVariable Long idAnnonces){
        Optional<Utilisateur> u = repository.findByEmail(jwtService.extractUsername(token)); 
        Annonces a = new Annonces(); 
        a.setIdAnnonce(idAnnonces);
        Favoris favoris = new Favoris(); 
        favoris.setUser(u.get());
        favoris.setAnnonce(a);
        return favorisService.save(favoris);
    }
}
