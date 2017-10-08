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
           double name = calculator.add(6,6);
        //Then
        Assert.assertEquals(12, name,0.1);
    }
}
