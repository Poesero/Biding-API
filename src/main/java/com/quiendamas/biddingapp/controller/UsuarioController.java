package com.quiendamas.biddingapp.controller;

import com.quiendamas.biddingapp.model.Usuario;
import com.quiendamas.biddingapp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

//    @Autowired
//    UsuarioRepository repository;

    @PostMapping("/usuario")
    public void newUsuario(@RequestBody Usuario user){
        System.out.println(("Datos del usuario:  -Nombre:" + user.getUserName() + "-Mail:" + user.getMail() ));
    }
}
