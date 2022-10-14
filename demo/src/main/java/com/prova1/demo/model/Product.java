package com.prova1.demo.model;

import java.util.Date;

import lombok.Data;

@Data
public class Product {
    private String description;
    private Integer price;
    private Date availableFrom;
}
