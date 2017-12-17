package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PeperoniPizzaOrder extends AbstractPizzaOrderDecorator{

    public PeperoniPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public String getIngredient() {
        return super.getIngredient()+" + crunchy peperoni";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }
}
