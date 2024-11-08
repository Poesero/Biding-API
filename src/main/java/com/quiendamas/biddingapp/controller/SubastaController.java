package com.quiendamas.biddingapp.controller;

import com.quiendamas.biddingapp.model.Subasta;
import com.quiendamas.biddingapp.model.Usuario;
import com.quiendamas.biddingapp.service.ISubastaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubastaController {

    @Autowired
    private ISubastaService interSubasta;

    @PostMapping("/subasta/create")
    public String creatSubasta(@RequestBody Subasta sub){
        interSubasta.creatSubasta(sub);
        return ("Subasta cargada con datos: -Nombre:" + sub.getName()
                + " -Usuario:" + sub.getUserName()
                + " -Descripción:" + sub.getDescription()
                + " -Oferta inicial: " + sub.getStartingBid()
                + " -Duración: " + sub.getDuration());
    }

    @GetMapping("/subasta/getAll")
    public List<Subasta> getSubastas(){
        return interSubasta.getSubastas();
    }

    @GetMapping("/subasta/get/{id}")
    public Subasta readSubasta(@PathVariable Long id) {
        return interSubasta.readSubasta(id);
    }

    @DeleteMapping("/subasta/delete/{id}")
    public String deleteSubasta(@PathVariable Long id){
        interSubasta.deleteSubasta(id);
        return "Subasta borrada";
    }

}
