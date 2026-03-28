package com.capgemini.shipping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capgemini.shipping.entity.Shipping;
import com.capgemini.shipping.service.ShippingService;

@RestController
@RequestMapping("/shipping")
public class ShippingController {

    @Autowired
    private ShippingService service;

    @PostMapping
    public String create(@RequestBody Shipping shipping) {
        service.save(shipping);
        return "Shipping created";
    }
}