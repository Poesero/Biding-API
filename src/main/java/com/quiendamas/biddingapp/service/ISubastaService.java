package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Subasta;

import java.util.List;

public interface ISubastaService {

    public void crearSubasta (Subasta bid);
    public List<Subasta> traerSubastas();
}
