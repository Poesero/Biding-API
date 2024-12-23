package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Subasta;

import java.util.List;

public interface ISubastaService {

    public void createSubasta (Subasta sub);
    public List<Subasta> getSubastas();
    public void deleteSubasta (Long id);
    public Subasta getSubasta(Long id);
}
