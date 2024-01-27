package com.projetS5.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetS5.back.service.FavorisService;

@RestController
@RequestMapping("/favoris")
public class FavorisController {
    @Autowired 
    private  FavorisService favorisService;
}
