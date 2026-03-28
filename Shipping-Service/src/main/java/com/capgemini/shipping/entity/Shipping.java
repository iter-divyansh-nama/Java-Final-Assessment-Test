package com.capgemini.shipping.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long deliveryId;
    private String address;
    private String estimatedTime;
}