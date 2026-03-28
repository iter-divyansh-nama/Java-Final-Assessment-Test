package com.capgemini.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capgemini.delivery.entity.Delivery;
import com.capgemini.delivery.service.DeliveryService;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService service;

    @PostMapping
    public String create(@RequestBody Delivery delivery) {
        service.save(delivery);
        return "Delivery created";
    }
}