package com.quiendamas.biddingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
