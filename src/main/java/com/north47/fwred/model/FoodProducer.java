package com.north47.fwred.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FoodProducer {

    @Id
    private String email;


    private String phoneNumber;

    private String name;

    @Embedded
    private Address address;
}
