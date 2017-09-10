package com.kodilla.testing.shape;

public class Square implements Shape {

    public String getShapeName(){
        return "Square";
    }

    public int getField(int a){
        return a*a;
    }
}
