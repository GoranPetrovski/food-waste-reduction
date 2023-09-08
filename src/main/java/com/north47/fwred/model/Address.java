package com.north47.fwred.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private String address;

    private String city;

    private String country;

    private Location location;
}
