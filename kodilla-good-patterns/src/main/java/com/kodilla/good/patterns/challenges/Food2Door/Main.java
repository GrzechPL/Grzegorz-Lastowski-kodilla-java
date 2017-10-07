package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Delivers> delivers = new LinkedList<>();
        delivers.add(new ExtraFoodShop());
        delivers.add(new GlutenFreeShop());
        delivers.add(new HealthyShop());

        for(Delivers interator : delivers){
            System.out.println(interator.process());
        }
    }




}
