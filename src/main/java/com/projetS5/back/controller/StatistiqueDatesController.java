package com.projetS5.back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetS5.back.model.StatistiqueDate;
import com.projetS5.back.service.StatistiqueDateService;

@RestController
@RequestMapping("/StatDate")
public class StatistiqueDatesController {
    @Autowired
    private StatistiqueDateService dateService;

    @GetMapping
    public java.util.List<StatistiqueDate> getAllDates() {
        return dateService.getAllDate();
    }

    
}
