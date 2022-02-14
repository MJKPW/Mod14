package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheeseDecorator extends AbstractPizzaOrderDecorator {

    public ExtraCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public String description() {
        return super.description() + ", extra cheese";
    }

    @Override
    public BigDecimal price() {
        return super.price().add(new BigDecimal(5));
    }
}
