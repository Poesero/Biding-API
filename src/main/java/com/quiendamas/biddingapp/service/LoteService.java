package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Lote;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoteService implements ILoteService {
    //métodos de lógica de negocio

    @Override
    public void crearLote(Lote lot) {

    }

    @Override
    public List<Lote> traerLotes() {
        return List.of();
    }


}
