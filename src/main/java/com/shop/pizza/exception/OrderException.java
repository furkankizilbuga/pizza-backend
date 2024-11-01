package com.shop.pizza.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class OrderException extends RuntimeException {

    private String message;
    private HttpStatus status;

    public OrderException(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }

}
