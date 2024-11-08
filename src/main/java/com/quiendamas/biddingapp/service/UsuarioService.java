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
    public void createUsuario(Usuario user) {
        usuarioRepository.save(user);
    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario readUsuario(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarioList = usuarioRepository.findAll();
        return usuarioList;
    }

    @Override
    public void editUsuario(Long id_original, String NewUserName, String NewMail, String NewPassword) {
        Usuario user = this.readUsuario(id_original);
        if (NewUserName != null && !NewUserName.isEmpty()) {
            user.setUserName(NewUserName);
        }
        if (NewMail != null && !NewMail.isEmpty()) {
            user.setMail(NewMail);
        }
        if (NewPassword != null && !NewPassword.isEmpty()) {
            user.setPassword(NewPassword);
        }
        this.createUsuario(user);
    }
}
