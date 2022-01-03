package com.kodilla.spring.calculator;

public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException() {
        super("Division by zero");
    }
}
