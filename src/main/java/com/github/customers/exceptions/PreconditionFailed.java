package com.github.customers.exceptions;

public class PreconditionFailed extends RuntimeException {

    public PreconditionFailed() {
    }

    public PreconditionFailed(String message) {
        super(message);
    }
}
