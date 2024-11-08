package com.quiendamas.biddingapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Puja {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String userName;
    private Double bidAmount;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;


    @ManyToOne
    private Subasta subasta;

    public Puja() {
    }

    public Puja(Long id, String userName, Double bidAmount,Usuario usuario, Subasta subasta) {
        this.id = id;
        this.userName = userName;
        this.bidAmount = bidAmount;
        this.usuario = usuario;
        this.subasta = subasta;
    }
}
