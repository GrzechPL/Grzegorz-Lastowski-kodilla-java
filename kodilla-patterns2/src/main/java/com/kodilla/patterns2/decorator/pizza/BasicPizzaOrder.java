package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public String getIngredient() {
        return "Składniki zamówienia pizzy : ciasto + sos pomidorowy + serem";
    }
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }
}
