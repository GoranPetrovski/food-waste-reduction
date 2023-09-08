package com.north47.fwred.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Market {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    private Address address;

}
