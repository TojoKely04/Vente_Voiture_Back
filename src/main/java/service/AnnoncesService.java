package service;

import repository.AnnonceRepository;
import org.springframework.stereotype.Service;
import model.Annonces;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class AnnoncesService {
    private final AnnonceRepository annonceRepository;

    public AnnoncesService(AnnonceRepository annonceRepository) {
        this.annonceRepository = annonceRepository;
    }

    public List<Annonces> getAllAnnonces() {
        List<Annonces> annonces = annonceRepository.findByEtatNot(10);
        if(annonces.isEmpty()) {
            return Collections.emptyList();
        }else {
            return annonces;
        }
    }

    public Annonces getAnnonceById(Long id) {
        Annonces annonce = annonceRepository.findByIdAnnonceAndEtatNot(id, 10);
        if(annonce == null) {
            return null;
        }else {
            return annonce;
        }
    }

    public Annonces createAnnonce(Annonces annonce) {
        try{
            return annonceRepository.save(annonce);
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Annonces updateAnnonceById(Long id, Annonces annonce) {
        Optional<Annonces> optionalAnnonce = Optional.ofNullable(annonceRepository.findByIdAnnonceAndEtatNot(id, 10));
        if(optionalAnnonce.isPresent()){
            Annonces annonceToUpdate = optionalAnnonce.get();
            annonceToUpdate.setNom(annonce.getNom()); 
            annonceToUpdate.setDescription(annonce.getDescription());
            annonceToUpdate.setIdCategorie(annonce.getIdCategorie());
            annonceToUpdate.setIdMarque(annonce.getIdMarque()); 
            annonceToUpdate.setCouleur(annonce.getCouleur()); 
            annonceToUpdate.setIdMoteur(annonce.getIdMoteur()); 
            annonceToUpdate.setAnnee(annonce.getAnnee()); 
            annonceToUpdate.setIdBoiteVitesse(annonce.getidBoiteVitesse());
            annonceToUpdate.setIdEnergie(annonce.getIdEnergie()); 
            annonceToUpdate.setPrix(annonce.getPrix()); 
            annonceToUpdate.setImage(annonce.getImage());
            annonceToUpdate.setDatePublication(annonce.getDatePublication());
            annonceRepository.save(annonceToUpdate); 
            return annonceToUpdate;
        }
        else{
            throw new RuntimeException("Annonce non trouvee");
        }
    }

    public Annonces deleteAnnonceById(Long id) {
        Optional<Annonces> optionalAnnonce = Optional.ofNullable(annonceRepository.findByIdAnnonceAndEtatNot(id, 10));
        if(optionalAnnonce.isPresent()){
            Annonces annonceToDelete = optionalAnnonce.get();
            annonceToDelete.setEtat(10);
            return annonceToDelete;
        }
        else {
            throw new RuntimeException("Annonce non trouvee");
        }
    }
}
