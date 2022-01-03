package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    @Test
    public void testCalculations() {
        //Given
        //When
        double add = calculator.add(6, 2);
        double sub = calculator.sub(6, 2);
        double mul = calculator.mul(6, 2);
        double div = calculator.div(6, 2);
        //Then
        Assertions.assertEquals(8, add);
        Assertions.assertEquals(4, sub);
        Assertions.assertEquals(12, mul);
        Assertions.assertEquals(3, div);
        Assertions.assertThrows(DivisionByZeroException.class, ()->calculator.div(6, 0));
    }
}
