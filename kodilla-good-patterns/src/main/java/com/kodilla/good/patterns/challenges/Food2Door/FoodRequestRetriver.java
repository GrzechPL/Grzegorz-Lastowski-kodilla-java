package com.kodilla.good.patterns.challenges.Food2Door;

public class FoodRequestRetriver {
    public FoodOrderRequest retrive(){

        FoodCompany  comp1 = new FoodCompany("ExtraFoodShop");
        FoodCompany  comp2 = new FoodCompany("HealthyShop");
        FoodCompany  comp3 = new FoodCompany("GlutenFreeShop");

        double quantity = 100;
        String productname ="eko Potatos" ;

        return new FoodOrderRequest(comp1,quantity,productname);
    }
}
