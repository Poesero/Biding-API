package com.quiendamas.biddingapp.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Lote {

    private Long id;
    private String name;
    private String owner;
    private String description;
    private Float startingValue;

    public Lote(){
    }

    public Lote(String name, Long id, String description, String owner, Float startingValue) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.owner = owner;
        this.startingValue = startingValue;
    }

}
