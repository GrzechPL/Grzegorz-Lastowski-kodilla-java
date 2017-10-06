package com.kodilla.good.patterns.challenges.Food2Door;

public class Food2Door {

    Delivers delivers;
    Double quantity;
    String typeofproduct;

    public Food2Door(Delivers delivers, Double quantity, String typeofproduct) {
        this.delivers = delivers;
        this.quantity = quantity;
        this.typeofproduct = typeofproduct;
    }

    public void process(Food2Door food2Door) {
        boolean isRented = true;
        if (isRented) {
            System.out.println("Transakcja zrealizowana");
        } else {
            System.out.println("Transakcja odrzucona");

        }
    }
}
