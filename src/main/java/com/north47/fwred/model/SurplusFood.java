package com.north47.fwred.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class SurplusFood {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private FoodProducer producer;

    private String name;

    private String description;

    private LocalDate goodBefore;

    private byte[] image;

    private Double totalQuantity;

    private Double minimumOrderAmount;

    @Enumerated(EnumType.STRING)
    private Unit measureUnit;
}
