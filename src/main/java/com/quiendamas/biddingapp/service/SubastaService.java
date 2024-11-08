package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Subasta;
import com.quiendamas.biddingapp.model.Usuario;
import com.quiendamas.biddingapp.repository.ISubastaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubastaService implements ISubastaService {

    @Autowired
    private ISubastaRepository subastaRepository;

    @Override
    public void creatSubasta(Subasta sub) {
        subastaRepository.save(sub);
    }

    @Override
    public List<Subasta> getSubastas() {
        List<Subasta> subastaList = subastaRepository.findAll();
        return subastaList;
    }

    @Override
    public Subasta readSubasta(Long id) {
        return subastaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteSubasta(Long id) {
        subastaRepository.deleteById(id);
    }
}
