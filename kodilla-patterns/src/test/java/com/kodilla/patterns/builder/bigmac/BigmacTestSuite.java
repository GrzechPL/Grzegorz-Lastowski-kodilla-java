package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigMacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilider()
                                .ingredient("Sałata")
                                .ingredient("Cebula")
                                .ingredient("Bekon")
                                .ingredient("Ogórek")
                                .roll("Sezam")
                                .sauce("1000 wysp")
                                .burgers(3)
                                .ingredient("Ser")
                                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(5, howManyIngredients);
    }

}
