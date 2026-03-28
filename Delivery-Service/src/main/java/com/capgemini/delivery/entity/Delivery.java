package com.capgemini.delivery.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long orderId;
    private String deliveryPartner;
    private String status;
}