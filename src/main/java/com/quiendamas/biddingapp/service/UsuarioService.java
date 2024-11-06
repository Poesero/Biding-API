package com.quiendamas.biddingapp.service;

import com.quiendamas.biddingapp.model.Usuario;
import com.quiendamas.biddingapp.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public void creatUsuario(Usuario user) {
        usuarioRepository.save(user);
    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario readUsuario(Long id) {
        Usuario user = usuarioRepository.findById(id).orElse(null);
        return user;
    }

    @Override
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarioList = usuarioRepository.findAll();
        return usuarioList;
    }
}
