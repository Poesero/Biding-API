package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Puja;
import com.quiendamas.biddingapp.repository.IPujaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PujaService implements IPujaService{

    @Autowired
    private IPujaRepository pujaRepository;

    @Override
    public void crearPuja(Puja puja) {

    }

    @Override
    public List<Puja> traerPujas() {
        return List.of();
    }
}
