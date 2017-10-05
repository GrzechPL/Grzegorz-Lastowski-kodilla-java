package com.kodilla.good.patterns.challenges.flycompany;

import java.util.HashMap;
import java.util.Map;

public class Fly {

    public Map<String,String> allFly() {

       final Map<String, String> allfly = new HashMap<>();

        allfly.put("Wrocław","Warszawa");
        allfly.put("Warszawa","Wrocław");
        allfly.put("Wrocław","Poznań");
        allfly.put("Poznań","Wrocław");

        return new HashMap<>(allfly);
    }

    public void findfly(GivenCityRetriver givenCityRetriver){

    }
}
