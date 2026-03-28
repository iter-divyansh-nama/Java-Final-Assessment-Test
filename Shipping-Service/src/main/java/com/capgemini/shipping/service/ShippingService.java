package com.capgemini.shipping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.shipping.entity.Shipping;
import com.capgemini.shipping.repository.ShippingRepository;

@Service
public class ShippingService {

    @Autowired
    private ShippingRepository repository;

    public Shipping save(Shipping shipping) {
        return repository.save(shipping);
    }
}