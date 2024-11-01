package com.shop.pizza.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "customer_name")
    private String customerName;

    private String note;

    @NotNull
    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;

    @NotNull
    private int count;

    @NotNull
    private Double total;

    @NotNull
    @Column(name = "created_at")
    private LocalDate createdAt;

}