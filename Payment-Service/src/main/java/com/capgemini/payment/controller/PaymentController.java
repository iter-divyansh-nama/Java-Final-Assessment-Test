package com.capgemini.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capgemini.payment.entity.Payment;
import com.capgemini.payment.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping
    public String pay(@RequestBody Payment payment) {
        return service.makePayment(payment);
    }
}