package com.kodilla.good.patterns.challenges.Food2Door;

public class ProductOrderServicePotatos implements ProductOrderService{

    public boolean rent(FoodCompany foodCompany, double quantity, String productname) {

        System.out.println("Zamówienie " +foodCompany+ " " + quantity +" " +productname  );

        return true;
    }
}
