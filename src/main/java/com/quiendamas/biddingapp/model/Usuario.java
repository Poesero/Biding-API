package com.quiendamas.biddingapp.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String userName;
    private String mail;
    private String password;
    private Double funds;

    @JsonManagedReference
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Subasta> subastas;

    @JsonManagedReference
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Puja> pujas;
    public Usuario(){
    }

    public Usuario(Long id, String userName, String mail, String password, Double funds) {
        this.id = id;
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.funds = funds;
    }

}
