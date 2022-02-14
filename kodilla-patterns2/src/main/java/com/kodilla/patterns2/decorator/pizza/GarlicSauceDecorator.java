package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class GarlicSauceDecorator extends AbstractPizzaOrderDecorator {

    public GarlicSauceDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public String description() {
        return super.description() + ", garlic sauce";
    }

    @Override
    public BigDecimal price() {
        return super.price().add(new BigDecimal(5));
    }

}
