package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Puja;

import java.util.List;

public interface IPujaService {

    public void crearPuja (Puja puja);
    public List<Puja> traerPujas();
}
