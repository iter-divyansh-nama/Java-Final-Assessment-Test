package com.capgemini.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.payment.entity.Payment;
import com.capgemini.payment.repository.PaymentRepository;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public String makePayment(Payment payment) {

        if (repository.existsByOrderId(payment.getOrderId())) {
            return "Payment already exists for this order";
        }

        repository.save(payment);
        return "Payment successful";
    }
}