package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Delivers {
    @Override
    public String process() {

        RandomPorcess randomPorcess = new RandomPorcess();
        boolean isRented = randomPorcess.random();

        if(isRented) {
            return "Zamówienie złożone w HealthyShop";
        } else {
            return  "Nie udało sie złożyć zamówienia w HealthyShop ";
        }
    }
}
