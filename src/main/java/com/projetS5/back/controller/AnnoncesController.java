package com.projetS5.back.controller;

import com.projetS5.back.model.Annonces;
import com.projetS5.back.model.AnnoncesStatus;
import com.projetS5.back.model.Utilisateur;
import com.projetS5.back.repository.UtilisateurRepository;
import com.projetS5.back.service.AnnoncesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/annonces")
public class AnnoncesController {

    @Autowired
    private AnnoncesService annoncesService;
    @Autowired
    private com.projetS5.back.config.JwtService jwtService;
    @Autowired
    private UtilisateurRepository repository;


    @GetMapping
    public List<Annonces> findAll() {
        return annoncesService.findAll();
    }

    @GetMapping("/nonLus")
    public List<Annonces> getAnnoncesNonLus() {
        return annoncesService.getAnnoncesNonLus();
    }


    @GetMapping("/{id}")
    public Annonces findById(@PathVariable Long id) {
        return annoncesService.findById(id);
    }

    // create a book
    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping
    public Annonces create(@RequestBody Annonces book) {
        return annoncesService.save(book);
    }

    // update a book
    @PutMapping
    public Annonces update(@RequestBody Annonces book) {
        return annoncesService.save(book);
    }

    // delete a book
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        annoncesService.deleteById(id);
    }
  
    @GetMapping("/annonceValideDispo")
    public List<Annonces> getAnnonceDispo(){
        return  annoncesService.getAnnonceDispo();
    }

    @GetMapping("Userfavoris/{token}")
    public List<Annonces> findFavorisByUser(@PathVariable String token) {
        Optional<Utilisateur> u = repository.findByEmail(jwtService.extractUsername(token)); 
        return annoncesService.findFavorisByUser(u.get().getIdUtilisateur());

    }

    @GetMapping("/Utilisateur/{token}")
    public List<Annonces> getAnnoncesUtilisateurs(@PathVariable String token) {
        Optional<Utilisateur> ou = repository.findByEmail(jwtService.extractUsername(token));
        Utilisateur u = ou.get();
        return annoncesService.findByUtilisateur(u);
    }
    
    @GetMapping("/status/{id}")
    public List<AnnoncesStatus> getAnnoncesStatusUser(@PathVariable Long id){
        return annoncesService.getAnnoncesStatus(id);
    }
}
