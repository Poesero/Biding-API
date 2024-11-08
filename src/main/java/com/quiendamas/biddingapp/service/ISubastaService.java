package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Subasta;
import com.quiendamas.biddingapp.model.Usuario;

import java.util.List;

public interface ISubastaService {

    public void creatSubasta (Subasta sub);
    public List<Subasta> getSubastas();
    public void deleteSubasta (Long id);
    public Subasta readSubasta (Long id);
}
