package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Subasta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubastaService implements ISubastaService {
    @Override
    public void crearSubasta(Subasta bid) {

    }

    @Override
    public List<Subasta> traerSubastas() {
        return List.of();
    }
}
