package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Puja;

import java.util.List;

public interface IPujaService {


    void createPuja(Puja puja);

    void deletePuja(Long id);

    public Puja getPuja(Long id);
}
