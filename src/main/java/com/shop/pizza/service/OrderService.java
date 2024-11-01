package com.shop.pizza.service;

import com.shop.pizza.dto.OrderRequest;
import com.shop.pizza.entity.Order;

import java.util.List;

public interface OrderService {

    List<Order> findAll();
    Order findById(Long id);
    Order save(OrderRequest request);
    void deleteById(Long id);

}
