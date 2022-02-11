package com.kodilla.patterns2.spring.calculator;

public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException() {
        super("Division by zero");
    }
}
