package com.example.visitorcounterapp.controller;

import com.example.visitorcounterapp.model.Visit;
import com.example.visitorcounterapp.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visitors-count")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @GetMapping("/userName/{userName}/count")
    public Visit getCount(@PathVariable String userName){
        Visit visit = urlService.getVisits(userName);
        return visit;
    }
}
