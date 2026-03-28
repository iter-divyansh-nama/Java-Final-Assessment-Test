package com.capgemini.shipping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.shipping.entity.Shipping;

public interface ShippingRepository extends JpaRepository<Shipping, Long> {
}