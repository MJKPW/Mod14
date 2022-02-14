package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void allIngredientsDescriptionTest() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new GarlicSauceDecorator(order);
        order = new PineappleDecorator(order);
        order = new ExtraCheeseDecorator(order);
        //When
        String description = order.description();
        //Then
        Assertions.assertEquals("Pizza dough, " +
                                           "tomato sauce, cheese, garlic sauce, " +
                                           "pineapple, extra cheese", description);
    }

    @Test
    public void allIngredientsPriceTest() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new GarlicSauceDecorator(order);
        order = new PineappleDecorator(order);
        order = new ExtraCheeseDecorator(order);
        //When
        BigDecimal price = order.price();
        //Then
        Assertions.assertEquals(35, price.intValue());
    }
}
