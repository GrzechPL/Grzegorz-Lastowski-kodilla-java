package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;
    public Calculator(int a , int b){
        this.a = a;
        this.b = b;
    }

    public int addAB(){
        return a+b;
    }
    public int subAB(){
        return a-b;
    }
}
