package com.quiendamas.biddingapp.controller;

import com.quiendamas.biddingapp.model.Subasta;
import com.quiendamas.biddingapp.repository.SubastaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubastaController {

    @Autowired
    SubastaRepository repository;

    @PostMapping("/subasta")
    public void newSubasta(@RequestBody Subasta sub){
        System.out.println(("Subasta cargada con datos: -Nombre:" + sub.getName()
                + " -Usuario:" + sub.getUserName()
                + " -Descripción:" + sub.getDescription()
                + " -Oferta inicial: " + sub.getStartingBid()
                + " -Duración: " + sub.getDuration()));
    }

}
