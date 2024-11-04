package com.quiendamas.biddingapp.controller;

import com.quiendamas.biddingapp.model.Puja;
import com.quiendamas.biddingapp.repository.PujaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PujaController {

    @Autowired
    PujaRepository repository;

    @PostMapping("/puja")
    public void newPuja(@RequestBody Puja puja){
        System.out.println(("Puja cargada con datos: -Nombre de usuario: " + puja.getUserName()
                + " -Monto de la oferta: " + puja.getBidAmount() ));
    }

}
