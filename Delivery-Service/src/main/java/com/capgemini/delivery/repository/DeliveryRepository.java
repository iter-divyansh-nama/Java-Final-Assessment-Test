package com.capgemini.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.delivery.entity.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}