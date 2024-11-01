package com.shop.pizza.service;

import com.shop.pizza.entity.Pizza;
import com.shop.pizza.exception.PizzaException;
import com.shop.pizza.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Override
    public List<Pizza> findAll() {
        return pizzaRepository.findAll();
    }

    @Override
    public Pizza findById(Long id) {
        return pizzaRepository.findById(id)
                .orElseThrow(() ->
                        new PizzaException("Pizza with given ID could not be found!", HttpStatus.NOT_FOUND)
                );
    }

    @Override
    public Pizza save(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    @Override
    public void deleteById(Long id) {
        findById(id);
        pizzaRepository.deleteById(id);
    }

}
