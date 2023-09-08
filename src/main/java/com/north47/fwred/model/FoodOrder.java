package com.north47.fwred.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class FoodOrder {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Client client;

    @ManyToOne
    private SurplusFood item;

    private Address pickUpAddress;

    private LocalDateTime pickupTime;

    private Boolean acceptedByProducer;

    private Boolean acceptedByClient;

    private Short producerRating;

    @Column(length = 3000)
    private String comment;


}
