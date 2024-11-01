package com.shop.pizza.repository;

import com.shop.pizza.entity.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {



}
