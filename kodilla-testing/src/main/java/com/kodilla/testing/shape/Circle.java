package com.kodilla.testing.shape;

//implementacja wymusza użycie metod interfejsu Shape

public class Circle implements Shape {

    private double a;

    public Circle(double a) {
        this.a = a;
    }

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {
        return a;
    }
}
