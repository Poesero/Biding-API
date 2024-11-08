package com.quiendamas.biddingapp.controller;

import com.quiendamas.biddingapp.model.Puja;
import com.quiendamas.biddingapp.repository.IPujaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PujaController {

    @Autowired
    private IPujaRepository interPuja;

    @PostMapping("/puja/create")
    public void newPuja(@RequestBody Puja puja){
        interPuja.createPuja(puja);
        System.out.println(("Puja cargada con datos: -Nombre de usuario: " + puja.getUserName()
                + " -Monto de la oferta: " + puja.getBidAmount() ));
    }

    @DeleteMapping("/puja/delete/{id}")
    public void deletePuja(@PathVariable Long id){
        interPuja.deletePuja(id);
    }

}
