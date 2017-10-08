package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.xml.bind.SchemaOutputResolver;

public class CalculatorTestSuite {

    @Test
    public void testGetUsername() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addresult = calculator.add(10,5);
        double subresult = calculator.sub(15,10);
        double mulresult = calculator.mul(20,15);
        double divresult = calculator.div(25,20);
        //Then
        Assert.assertEquals(15, addresult,0.1);
        Assert.assertEquals(5, subresult,0.1);
        Assert.assertEquals(300, mulresult,0.1);
        Assert.assertEquals(1.25, divresult,0.1);
    }
}
