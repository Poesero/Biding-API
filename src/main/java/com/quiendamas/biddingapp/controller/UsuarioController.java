package com.quiendamas.biddingapp.controller;

import com.quiendamas.biddingapp.model.Usuario;
import com.quiendamas.biddingapp.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    private IUsuarioService interUsuario;

    @PostMapping("/usuario/create")
    public String creatUsuario(@RequestBody Usuario user){
        System.out.println(("Datos del usuario:  |-Nombre: " + user.getUserName() + " |-Mail: " + user.getMail() ));
        interUsuario.creatUsuario(user);

        return "Usuario creado con exito";
    }

    @DeleteMapping("/usuario/delete/{id}")
    public String deleteUsuario(@PathVariable Long id) {

        interUsuario.deleteUsuario(id);
        return "Usuario borrado";
    }
}
