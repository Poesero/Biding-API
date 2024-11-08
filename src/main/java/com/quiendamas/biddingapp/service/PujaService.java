package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Puja;
import com.quiendamas.biddingapp.repository.IPujaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PujaService implements IPujaService{

    @Autowired
    private IPujaRepository pujaRepository;

    @Override
    public void createPuja(Puja puja) {
        pujaRepository.save(puja);
    }

    @Override
    public void deletePuja(Long id) {
        pujaRepository.deleteById(id);
    }

    @Override
    public Puja getPuja(Long id){ return pujaRepository.findById(id).orElse(null);}

}
