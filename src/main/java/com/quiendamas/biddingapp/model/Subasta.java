package com.quiendamas.biddingapp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Subasta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String userName;
    private String description;
    private Double startingBid;
    private Double duration;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToOne
    private Puja highestBidder;

    public Subasta() {
    }

    public Subasta(Long id, String name, String userName, String description, Double startingBid, Double duration,Usuario usuario, Puja highestBidder) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.description = description;
        this.startingBid = startingBid;
        this.duration = duration;
        this.usuario = usuario;
        this.highestBidder = highestBidder;
    }
}
