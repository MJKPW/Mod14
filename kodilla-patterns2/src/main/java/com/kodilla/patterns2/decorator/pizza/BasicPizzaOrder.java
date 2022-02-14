package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {

    @Override
    public String description() {
        return "Pizza dough, tomato sauce, cheese";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(15);
    }

}
