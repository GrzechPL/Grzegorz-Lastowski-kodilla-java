package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    //kolekcja przechowuje objekty implementujące interfejs

    ArrayList<Shape> figures = new ArrayList<Shape>();


    public void addFigure (Shape shape){
         figures.add(shape);
    }

    public void removeFigure (Shape shape){
        figures.remove(shape);
    }

    public Shape getFigure (int n){
        return figures.get(n);
    }

    public void showFigure (){
        for (Shape shape : figures) {
            System.out.println(shape.getShapeName());
        }
    }

}
