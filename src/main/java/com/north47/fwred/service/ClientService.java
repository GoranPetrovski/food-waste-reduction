package com.north47.fwred.service;

import com.north47.fwred.model.Address;
import com.north47.fwred.model.Client;
import com.north47.fwred.model.SurplusFood;
import com.north47.fwred.model.filters.SurplusFoodFilter;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface ClientService {
    Client register(String email, String phone, String name, Address address);

    Client updateProfile(String email, String phone, String name, Address address);

    Page<SurplusFood> listItems(Optional<String> clientEmail, SurplusFoodFilter filter);
}
