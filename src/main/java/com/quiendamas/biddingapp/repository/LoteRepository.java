package com.quiendamas.biddingapp.repository;

import com.quiendamas.biddingapp.model.Lote;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LoteRepository implements ILoteRepository {
    @Override
    public List<Lote> traerTodos() {
        return List.of();
    }

    //métodos para llamar a la base de datos, etc
}
