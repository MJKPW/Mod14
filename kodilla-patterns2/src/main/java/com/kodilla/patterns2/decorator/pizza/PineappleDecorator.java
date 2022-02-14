package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PineappleDecorator extends AbstractPizzaOrderDecorator {

    public PineappleDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public String description() {
        return super.description() + ", pineapple";
    }

    @Override
    public BigDecimal price() {
        return super.price().add(new BigDecimal(10));
    }

}
