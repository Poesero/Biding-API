package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Puja;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PujaService implements IPujaService{
    @Override
    public void crearPuja(Puja puja) {

    }

    @Override
    public List<Puja> traerPujas() {
        return List.of();
    }
}
