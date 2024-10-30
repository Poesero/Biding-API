package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Lote;

import java.util.List;

public interface ILoteService {

    public void crearLote (Lote lot);
    public List<Lote> traerLotes();
}
