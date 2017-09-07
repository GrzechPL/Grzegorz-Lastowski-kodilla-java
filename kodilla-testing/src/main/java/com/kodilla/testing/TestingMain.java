package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        int a = 50;
        int b = 45;
        int resultadd = Calculator.addAB(a,b);
        if(resultadd==(a+b)){
            System.out.println("Test add ok");
        } else {
            System.out.println("Error add");
        }
        int resultsub = Calculator.subAB(a,b);
        if(resultsub==(a-b)){
            System.out.println("Test sub ok");
        } else {
            System.out.println("Error sub");
        }
        }
    }
