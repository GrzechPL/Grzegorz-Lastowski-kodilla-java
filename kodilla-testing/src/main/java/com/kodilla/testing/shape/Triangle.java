package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double a;

    public Triangle(double a) {
        this.a = a;
    }

    public String getShapeName(){
        return "Triangle";
    }

    public double getField() {
        return a;
    }
}
