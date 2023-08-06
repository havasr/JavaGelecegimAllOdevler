package com.allianz.erp.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ProductDTO {
    private UUID uuid;
    private String name;
    private int stock;
    private boolean hasVAT;
    private ProductTypeEnum productType;
    private double price;
    public ProductDTO() {
        this.uuid = UUID.randomUUID();
    }
}
