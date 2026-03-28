package com.capgemini.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.payment.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    boolean existsByOrderId(Long orderId);
}