package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    double add(double a, double b){

        Display display = new Display();
        display.displayValue(a+b);

        return a+b;
    }
    double sub(double a, double b){

        Display display = new Display();
        display.displayValue(a-b);

        return a-b;
    }
    double mul(double a, double b){

        Display display = new Display();
        display.displayValue(a*b);

        return a*b;
    }
    double div(double a, double b){

        Display display = new Display();
        display.displayValue(a/b);

        return a/b;
    }

    public static void main(String[] args) {

        Calculator calculator =new Calculator();
        calculator.add(15,5);
        calculator.sub(15,5);
        calculator.mul(15,5);
        calculator.div(15,5);

    }

}
