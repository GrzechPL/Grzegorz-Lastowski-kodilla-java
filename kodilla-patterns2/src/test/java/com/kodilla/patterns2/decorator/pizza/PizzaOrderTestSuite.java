package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPeperoniAndCheeseEdgesGetIngridient(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PeperoniPizzaOrder(theOrder);
        theOrder = new CheeseOnTheEdgesPizzaOrder(theOrder);
        //When
        String ing = theOrder.getIngredient();
        //Then
        assertEquals("Składniki zamówienia pizzy : ciasto + sos pomidorowy + serem + crunchy peperoni + cheeseOnTheEdges",ing);
    }
    @Test
    public void testPeperoniAndCheeseEdgesGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PeperoniPizzaOrder(theOrder);
        theOrder = new CheeseOnTheEdgesPizzaOrder(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(26),theCost);
    }
}
