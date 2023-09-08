package com.north47.fwred.service;

import com.north47.fwred.model.*;
import com.north47.fwred.model.filters.MarketAttendanceFilter;
import com.north47.fwred.model.filters.SurplusFoodFilter;
import org.springframework.data.domain.Page;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface ProducerService {

    FoodProducer register(String email, String phone, String name, Address address);

    FoodProducer updateProfile(String email, String phone, String name, Address address);

    Page<SurplusFood> listProducerItems(String producerEmail, SurplusFoodFilter filter);

    SurplusFood addItem(String name, String description, LocalDate goodBefore,
                        Double totalQuantity, Double minimumOrderAmount, Unit measureUnit);

    SurplusFood updateItem(Long id, String name, String description, LocalDate goodBefore,
                           Double totalQuantity, Double minimumOrderAmount, Unit measureUnit);


    Page<MarketAttendance> listMarketAttendances(String producerEmail, MarketAttendanceFilter filter);

    MarketAttendance registerMarketAttendance(Market market, String producerEmail,
                                              LocalDateTime presentFrom, LocalDateTime presentTo);

    MarketAttendance cancelMarketAttendance(Long marketAttendanceId, String producerEmail);


}
