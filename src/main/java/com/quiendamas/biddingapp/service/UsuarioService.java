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
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarioList = usuarioRepository.findAll();
        return usuarioList;
    }

    @Override
    public void editUsuario(Long id_original, Long idNew, String NewUserName, String NewMail) {
        Usuario user = this.readUsuario(id_original);
        user.setId(idNew);
        user.setUserName(NewUserName);
        user.setMail(NewMail);

        this.creatUsuario(user);
    }
}
