package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Usuario;

import java.util.List;

public interface IUsuarioService {

    public void createUsuario(Usuario user);

    public void deleteUsuario (Long id);

    public Usuario readUsuario (Long id);

    public List<Usuario> getUsuarios();


    public void editUsuario (Long id_original, String NewUserName, String NewMail, String NewPassword);

}
