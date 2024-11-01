package com.shop.pizza.service;

import com.shop.pizza.entity.Pizza;

import java.util.List;

public interface PizzaService {

    List<Pizza> findAll();
    Pizza findById(Long id);
    Pizza save(Pizza pizza);
    void deleteById(Long id);

}
