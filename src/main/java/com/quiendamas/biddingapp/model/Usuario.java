package com.quiendamas.biddingapp.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Usuario {

    private Long id;
    private String userName;
    private String mail;
    private Double funds;

    public Usuario(){
    }

    public Usuario(Long id, String userName, String mail, Double funds) {
        this.id = id;
        this.userName = userName;
        this.mail = mail;
        this.funds = funds;
    }

}
