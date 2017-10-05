package com.kodilla.good.patterns.challenges.Food2Door;

public class FoodOrderRequest {

    public FoodCompany foodCompany;
    public double quantity;
    public String productname;

    public FoodOrderRequest(FoodCompany foodCompany, double quantity, String productname) {
        this.foodCompany = foodCompany;
        this.quantity = quantity;
        this.productname = productname;
    }

    public FoodCompany getFoodCompany() {
        return foodCompany;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getProductname() {
        return productname;
    }
}
