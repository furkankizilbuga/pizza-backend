package com.shop.pizza.controller;

import com.shop.pizza.entity.Pizza;
import com.shop.pizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pizza")
@CrossOrigin(origins = "http://localhost:9000")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping
    public List<Pizza> findAll() {
        return pizzaService.findAll();
    }

    @GetMapping("/{id}")
    public Pizza findById(@PathVariable Long id) {
        return pizzaService.findById(id);
    }

    @PostMapping
    public Pizza save(@RequestBody Pizza pizza) {
        return pizzaService.save(pizza);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        pizzaService.deleteById(id);
    }
}
