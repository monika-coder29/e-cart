package com.cnc.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnc.ecart.model.Delivery;
import com.cnc.ecart.repository.DeliveryRepository;

@Service
public class DeliveryService {
     @Autowired
     private DeliveryRepository deliveryRepository;
     
     public Delivery addDelivery(Delivery delivery) {
    	 return deliveryRepository.save(delivery);
     }
}
