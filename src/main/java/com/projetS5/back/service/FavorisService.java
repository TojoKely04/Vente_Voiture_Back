package com.projetS5.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetS5.back.model.Favoris;
import com.projetS5.back.repository.FavorisRepository;

@Service
public class FavorisService {
    @Autowired
    private FavorisRepository favorisRepository;

    public Favoris save (Favoris favoris){
        return favorisRepository.save(favoris);
    }

}
