package com.north47.fwred.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class MarketAttendance {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Market market;

    @ManyToOne
    private FoodProducer producer;

    private LocalDateTime presentFrom;

    private LocalDateTime presentTo;

    private Boolean canceled = false;


}
