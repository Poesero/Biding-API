package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    public void crearUsuario (Usuario user);
    public List<Usuario> traerUsuarios();
}
