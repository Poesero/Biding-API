package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Usuario;
import com.quiendamas.biddingapp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void crearUsuario(Usuario user) {

    }

    @Override
    public List<Usuario> traerUsuarios() {
        return List.of();
    }
}
