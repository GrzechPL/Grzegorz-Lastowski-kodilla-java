package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CheeseOnTheEdgesPizzaOrder extends AbstractPizzaOrderDecorator{

    public CheeseOnTheEdgesPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public String getIngredient() {
        return super.getIngredient()+" + cheeseOnTheEdges";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(6));
    }
}
