package com.capgemini.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capgemini.order.entity.Order;
import com.capgemini.order.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping
    public String createOrder(@RequestBody Order order) {
        service.placeOrder(order);
        return "Order placed successfully";
    }
}