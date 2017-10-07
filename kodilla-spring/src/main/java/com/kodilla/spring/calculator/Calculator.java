package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

     Display add(double a,double b){

       display.displayValue(a+b);
        return new Display();
    }


    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Display display = context.getBean(Display.class);

        display.displayValue(10);

    }

}
