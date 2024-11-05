package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Subasta;
import com.quiendamas.biddingapp.repository.SubastaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubastaService implements ISubastaService {

    @Autowired
    private SubastaRepository subastaRepository;

    @Override
    public void crearSubasta(Subasta bid) {

    }

    @Override
    public List<Subasta> traerSubastas() {
        return List.of();
    }
}
