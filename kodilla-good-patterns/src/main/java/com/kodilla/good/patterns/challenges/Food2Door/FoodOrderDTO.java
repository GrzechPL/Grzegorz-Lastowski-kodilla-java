package com.kodilla.good.patterns.challenges.Food2Door;

public class FoodOrderDTO {

    public FoodCompany foodCompany;
    public Boolean isOrdered;

    public FoodOrderDTO(FoodCompany foodCompany, Boolean isOrdered) {
        this.foodCompany = foodCompany;
        this.isOrdered = isOrdered;
    }
}
