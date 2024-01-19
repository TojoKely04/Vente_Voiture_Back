package controller;

import jakarta.validation.Valid;
import service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/annonces")
public class AnnoncesController{
    @Autowired
    // private final AnnoncesService annonceService;

    @GetMapping
    public String getAllAnnonces() {
        // Reponse<List<Annonces>> reponse = new Reponse<>();
        // try {
        //     List<Annonces> annonces = annonceService.getAllAnnonces();
        //     if (!annonces.isEmpty()) {
        //         reponse.setData(annonces);
        //         reponse.setRemarque("Liste des annonces");
        //         return ResponseEntity.ok().body(reponse);
        //     } else {
        //         reponse.setErreur("Liste vide");
        //         return ResponseEntity.status(404).body(reponse);
        //     }
        // }
        // catch (Exception e) {
        //     reponse.setErreur(e.getMessage());
        //     return ResponseEntity.status(500).body(reponse);
        // }
        return "hello";
    }

    // @GetMapping("/{id}")
    // public ResponseEntity<Reponse<Annonces>> getAnnonceById(@PathVariable String id) {
    //     Reponse<Annonces> reponse = new Reponse<>();
    //     try{
    //         Annonces annonce = annonceService.getAnnonceById(id);
    //         if(annonce != null){
    //             reponse.setData(annonce);
    //             reponse.setRemarque("Annonce trouvee");
    //             return ResponseEntity.ok().body(reponse);
    //         }
    //         else{
    //             reponse.setErreur("Annonce non trouvee");
    //             return ResponseEntity.status(404).body(reponse);
    //         }
    //     }
    //     catch (Exception e) {
    //         reponse.setErreur(e.getMessage());
    //         return ResponseEntity.status(500).body(reponse);
    //     }
    // }

    // @PostMapping
    // public ResponseEntity<Reponse<Annonces>> createAnnonce(@RequestBody Annonces annonce) {
    //     Reponse<Annonces> reponse = new Reponse<>();
    //     try{
    //         Annonces annonceCreated = annonceService.createAnnonce(annonce);
    //         if(annonceCreated != null){
    //             reponse.setData(annonceCreated);
    //             reponse.setRemarque("Annonce creee");
    //             return ResponseEntity.status(201).body(reponse);
    //         }else{
    //             reponse.setErreur("Annonce non creee");
    //             return ResponseEntity.status(400).body(reponse);
    //         }
    //     }catch (Exception e) {
    //         reponse.setErreur(e.getMessage());
    //         return ResponseEntity.status(500).body(reponse);
    //     }
    // }

    // @PutMapping("/{id}")
    // public ResponseEntity<Reponse<Annonces>> updateAnnonce(@PathVariable String id, @Valid @RequestBody Annonces annonce) {
    //     Reponse<Annonces> reponse = new Reponse<>();
    //     try{
    //         Annonce annonce1 = annonceService.updateAnnonceById(id, annonce);
    //         if(annonce1 != null){
    //             reponse.setData(annonce1);
    //             reponse.setRemarque("Annonce modifiee");
    //             return ResponseEntity.ok().body(reponse);
    //         }else{
    //             reponse.setErreur("Annonce non trouvee");
    //             return ResponseEntity.status(404).body(reponse);
    //         }
    //     }
    //     catch (Exception e) {
    //         reponse.setErreur(e.getMessage());
    //         return ResponseEntity.status(500).body(reponse);
    //     }
    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<Reponse<Annonces>> deleteAnnonce(@PathVariable String id) {
    //     Reponse<Annonces> reponse = new Reponse<>();
    //     try{
    //         Annonces annonce = annonceService.deleteAnnonceById(id);
    //         if(annonce != null){
    //             reponse.setData(annonce);
    //             reponse.setRemarque("Annonce supprimee");
    //             return ResponseEntity.ok().body(reponse);
    //         }
    //         else{
    //             reponse.setErreur("Annonce non trouvee");
    //             return ResponseEntity.status(404).body(reponse);
    //         }
    //     }
    //     catch (Exception e) {
    //         reponse.setErreur(e.getMessage());
    //         return ResponseEntity.status(500).body(reponse);
    //     }
    // }
}