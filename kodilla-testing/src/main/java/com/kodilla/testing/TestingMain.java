package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        int arg1 = 50;
        int arg2 = 30;
        Calculator calculator = new Calculator(arg1,arg2);
        int resultadd = calculator.addAB();
        if(resultadd==arg1+arg2){
            System.out.println("Test add ok");
        } else {
            System.out.println("Error add");
        }
        int resultsub = calculator.subAB();
        if(resultsub==arg1-arg2){
            System.out.println("Test sub ok");
        } else {
            System.out.println("Error sub");
        }
        }
    }
