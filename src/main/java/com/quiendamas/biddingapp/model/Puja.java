package com.quiendamas.biddingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter
@Entity
public class Puja {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String userName;
    private Double bidAmount;

    public Puja(){
    }

    public Puja(Long id, String userName, Double bidAmount) {
        this.id = id;
        this.userName = userName;
        this.bidAmount = bidAmount;
    }
}
