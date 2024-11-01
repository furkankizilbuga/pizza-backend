package com.shop.pizza.service;

import com.shop.pizza.dto.OrderRequest;
import com.shop.pizza.entity.Order;
import com.shop.pizza.exception.OrderException;
import com.shop.pizza.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() ->
                    new OrderException("Order with given ID could not be found!", HttpStatus.NOT_FOUND)
                );
    }

    @Override
    public Order save(OrderRequest request) {

        Order order = new Order();
        order.setPizza(request.getPizza());
        order.setCustomerName(request.getCustomerName());
        order.setNote(request.getNote());
        order.setCount(request.getCount());
        order.setTotal(request.getTotal());
        order.setCreatedAt(LocalDate.now());

        return orderRepository.save(order);

    }

    @Override
    public void deleteById(Long id) {
        findById(id);
        orderRepository.deleteById(id);
    }

}
