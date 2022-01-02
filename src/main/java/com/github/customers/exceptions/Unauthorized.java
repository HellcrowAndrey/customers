package com.github.customers.exceptions;

public class Unauthorized extends RuntimeException {

    public Unauthorized() {
    }

    public Unauthorized(String message) {
        super(message);
    }
}
