package com.kodilla.testing.shape;

public class Triangle implements Shape {

    public String getShapeName(){
        return "Triangle";
    }

    public int getField(int a) {
        return a*a;
    }
}
