package com.shop.pizza.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String name;

    private String mini;

    @NotEmpty
    private String img;

    @NotNull
    private Double price;

    @NotNull
    private Double rating;

    @NotNull
    private int ratingCount;

    @NotEmpty
    private String description;

}