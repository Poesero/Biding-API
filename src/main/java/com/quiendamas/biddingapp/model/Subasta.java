package com.quiendamas.biddingapp.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Subasta {

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
