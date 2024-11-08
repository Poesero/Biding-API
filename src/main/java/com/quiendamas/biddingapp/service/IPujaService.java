package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Puja;

import java.util.List;

public interface IPujaService {


    public void createPuja(Puja puja);

    public void deletePuja(Long id);

    public Puja getPuja(Long id);
}
