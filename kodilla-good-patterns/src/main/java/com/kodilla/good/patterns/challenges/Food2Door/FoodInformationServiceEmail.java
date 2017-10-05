package com.kodilla.good.patterns.challenges.Food2Door;

public class FoodInformationServiceEmail implements  FoodInformationService {

    public void inform(FoodCompany foodCompany) {

        System.out.println("email" + foodCompany);

    }
}
