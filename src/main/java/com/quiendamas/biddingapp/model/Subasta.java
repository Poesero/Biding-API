package com.quiendamas.biddingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

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
    private String highestBidder;

    public Subasta(){
    }

    public Subasta(Long id, String name, String userName, String description, Double startingBid, Double duration, String highestBidder) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.description = description;
        this.startingBid = startingBid;
        this.duration = duration;
        this.highestBidder = highestBidder;
    }
}
