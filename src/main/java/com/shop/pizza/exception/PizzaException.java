package com.shop.pizza.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class PizzaException extends RuntimeException {

    private String message;
    private HttpStatus status;

    public PizzaException(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }
}
