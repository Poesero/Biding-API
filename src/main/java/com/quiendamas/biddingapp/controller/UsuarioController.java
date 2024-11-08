package com.quiendamas.biddingapp.controller;

import com.quiendamas.biddingapp.model.Usuario;
import com.quiendamas.biddingapp.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private IUsuarioService interUsuario;

    @PostMapping("/usuario/create")
    public String createUsuario(@RequestBody Usuario user){
        System.out.println(("Datos del usuario:  |-Nombre: " + user.getUserName() + " |-Mail: " + user.getMail() ));
        interUsuario.createUsuario(user);

        return "Usuario creado con exito";
    }

    @DeleteMapping("/usuario/delete/{id}")
    public String deleteUsuario(@PathVariable Long id) {

        interUsuario.deleteUsuario(id);
        return "Usuario borrado";
    }

    @GetMapping("/usuario/get/{id}")
    public Usuario readUsuario(@PathVariable Long id) {
        return interUsuario.readUsuario(id);
    }

    @GetMapping("/usuario/getAll")
    public List<Usuario> getUsuarios(){
        return interUsuario.getUsuarios();
    }

    @PutMapping("/usuario/edit/{id_original}")
    public Usuario editUsuario(@PathVariable Long id_original,
        @RequestParam(required = false,name = "userName") String NewUserName,
        @RequestParam(required = false,name = "mail" ) String NewMail,
        @RequestParam(required = false,name = "password" ) String NewPassword){

        Usuario user = interUsuario.readUsuario(id_original);

        if (NewUserName != null) {
            user.setUserName(NewUserName);
        }
        if (NewMail != null) {
            user.setMail(NewMail);
        }
        if (NewPassword != null) {
            user.setPassword(NewPassword);
        }
        interUsuario.editUsuario(id_original,
                NewUserName != null ? NewUserName : user.getUserName(),
                NewMail != null ? NewMail : user.getMail(),
                NewPassword != null? NewPassword: user.getPassword());



        return user;
    }

}
