package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{
    @Override
    public void crearUsuario(Usuario user) {

    }

    @Override
    public List<Usuario> traerUsuarios() {
        return List.of();
    }
}
