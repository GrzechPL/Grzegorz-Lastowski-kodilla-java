package com.kodilla.good.patterns.challenges.flycompany;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Fly {

    public Map<String,String> allFly() {

       final Map<String, String> allfly = new HashMap<>();

        allfly.put("Wrocław","Warszawa");
        allfly.put("Warszawa","Wrocław");
        allfly.put("Wrocław","Poznań");
        allfly.put("Poznań","Wrocław");
        allfly.put("Poznań","Wrocław");
        allfly.put("Poznań","Wrocław");


        return new HashMap<>(allfly);
    }

    public void findFromCity(String city){

    Map<Object, Object> formcity =allFly().entrySet().stream()
            .filter(x->x.getKey().equals(city))
            .collect(Collectors.toMap(k->k.getKey(),v-> v.getValue()));

       System.out.println(formcity);




      /*  if(allFly().containsKey(city))
        {
          System.out.println("Lista kluczy zawiera napewno lot z " +city);
        }
        else
        {
            System.out.println("Nie zawieram lotu z miasta " +city);
        }*/
    }

    public void findToCity(String city){


        if(allFly().containsValue(city))
        {
            System.out.println("Lista wartości zawiera napewno lot do " +city);
        }
        else
        {
            System.out.println("Nie zawieram lotu do miasta " +city);
        }
    }

    public static void main(String[] args) {
        Fly fly = new Fly();
        fly.findFromCity("Poznań");
        fly.findToCity("Wrocław");
    }
}
