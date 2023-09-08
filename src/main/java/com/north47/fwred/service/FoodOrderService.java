package com.north47.fwred.service;

import com.north47.fwred.model.Address;
import com.north47.fwred.model.FoodOrder;
import com.north47.fwred.model.SurplusFood;

import java.time.LocalDateTime;

public interface FoodOrderService {

    FoodOrder makeOrder(Long itemId, String clientEmail, Double quantity, Address pickUpAddress, LocalDateTime pickupTime);

    FoodOrder suggestOrderTimeAndPlaceByProducer(Long orderId, String producerEmail, Address pickUpAddress, LocalDateTime pickupTime);

    FoodOrder suggestOrderTimeAndPlaceByClient(Long orderId, String clientEmail, Address pickUpAddress, LocalDateTime pickupTime);

    FoodOrder acceptOrderByProducer(Long orderId, String producerEmail);

    FoodOrder acceptOrderByClient(Long orderId, String clientEmail);

    FoodOrder rateProducer(Long orderId, Short rating, String comment);


}
