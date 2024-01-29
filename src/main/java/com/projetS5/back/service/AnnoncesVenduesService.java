package com.projetS5.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetS5.back.model.AnnoncesVendues;
import com.projetS5.back.repository.AnnoncesVenduesRepository;

@Service
public class AnnoncesVenduesService {
    @Autowired
    private AnnoncesVenduesRepository annoncesVenduesRepository; 

    public List<AnnoncesVendues> findAll(){
        return annoncesVenduesRepository.findAll();
    }

    public AnnoncesVendues findById (Long id){
        return annoncesVenduesRepository.findById(id).orElse(null);
    }

    public AnnoncesVendues save (AnnoncesVendues a){
        return annoncesVenduesRepository.save(a);
    }
    
    public void deleteById (Long id){
        annoncesVenduesRepository.deleteById(id);
    }
}

