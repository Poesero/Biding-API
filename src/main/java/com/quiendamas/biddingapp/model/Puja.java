package com.quiendamas.biddingapp.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Puja {

    private Long id;
    private Usuario userName;
    private Double bidAmount;

    public Puja(){
    }

    public Puja(Long id, Usuario userName, Double bidAmount) {
        this.id = id;
        this.userName = userName;
        this.bidAmount = bidAmount;
    }
}
