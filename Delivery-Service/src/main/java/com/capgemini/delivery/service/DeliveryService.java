package com.capgemini.delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.delivery.entity.Delivery;
import com.capgemini.delivery.repository.DeliveryRepository;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository repository;

    public Delivery save(Delivery delivery) {
        return repository.save(delivery);
    }
}