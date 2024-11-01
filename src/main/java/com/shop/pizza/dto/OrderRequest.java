package com.shop.pizza.dto;

import com.shop.pizza.entity.Pizza;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class OrderRequest {

    @NotNull
    private Pizza pizza;

    @NotEmpty
    private String customerName;

    private String note;

    @NotNull
    private int count;

    @NotNull
    private Double total;

}
