package com.quiendamas.biddingapp.controller;

import com.quiendamas.biddingapp.model.Puja;
import com.quiendamas.biddingapp.repository.IPujaRepository;
import com.quiendamas.biddingapp.service.IPujaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PujaController {

    @Autowired
    private IPujaService interPuja;

    @PostMapping("/puja/create")
    public String createPuja(@RequestBody Puja puja){
        interPuja.createPuja(puja);
        System.out.println(("Puja cargada con datos: -Nombre de usuario: " + puja.getUserName()
                + " -Monto de la oferta: " + puja.getBidAmount() ));
        return "Puja creada con exito";
    }

    @DeleteMapping("/puja/delete/{id}")
    public String deletePuja(@PathVariable Long id){
        interPuja.deletePuja(id);
        return "Puja borrada";
    }

    @GetMapping("/puja/get/{id}")
    public Puja getPuja (@PathVariable Long id){
       return interPuja.getPuja(id);
    }

}
