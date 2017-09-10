package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    //kolekcja przechowuje objekty implementujące interfejs
    ArrayList<Shape> figures = new ArrayList<Shape>();

    public void addFigure (Shape shape){
         figures.add(shape);
    }
    public void remoweFigure (Shape shape){
        figures.remove(shape);
    }
    public void getFigure (int n){
        figures.get(n);
    }

    public void showFigure (){
        System.out.println(figures);
    }

}
