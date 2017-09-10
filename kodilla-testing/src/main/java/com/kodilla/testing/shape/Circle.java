package com.kodilla.testing.shape;

//implementacja wymusza użycie metod interfejsu Shape
public class Circle implements Shape {

    public String getShapeName() {
        return "Circle";
    }

    public int getField(int a) {
        return a*a;
    }
}
