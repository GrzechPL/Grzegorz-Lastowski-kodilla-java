package com.kodilla.good.patterns.challenges.flycompany;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MainFly {

    public List<Flight> allFly() {

       final List<Flight> allfly = new LinkedList<>();

        allfly.add(new Flight("Wrocław","Warszawa"));
        allfly.add(new Flight("Wrocław","Poznań"));
        allfly.add(new Flight("Poznań","Warszawa"));
        allfly.add(new Flight("Gdańsk","Warszawa"));
        allfly.add(new Flight("Gdynia","Poznań"));

        return new LinkedList<>(allfly);
    }

    public void findFromCity(String city){

    List<Flight> formcity =allFly().stream()
            .filter(x->city.equals(x.flightFROM))
            .collect(Collectors.toList());

      for(Flight temp :formcity){
          System.out.println(temp.flightFROM + "-->>" + temp.flightTO);
    }
    }

    public void findToCity(String city){

        List<Flight> formcity =allFly().stream()
                .filter(x->city.equals(x.flightTO))
                .collect(Collectors.toList());

        for(Flight temp :formcity){
            System.out.println(temp.flightTO + "-->>" + temp.flightFROM);
        }
    }

    public void findThrowAnotherCity(String city1,String city2){

        List<Flight> formcity1 =allFly().stream()
                .filter(x->city1.equals(x.flightFROM))
                .filter(x->!city2.equals(x.flightTO))
                .collect(Collectors.toList());

        for(Flight temp :formcity1){
            System.out.println(temp.flightFROM + "-->>" + temp.flightTO);
        }

        List<Flight> formcity2 =allFly().stream()
                .filter(x->city2.equals(x.flightTO))
               //.filter(x->formcity1.contains(x.flightTO))
                .collect(Collectors.toList());

        System.out.println();
        for(Flight temp :formcity2){
            System.out.println(temp.flightFROM + "-->>" + temp.flightTO);
        }

    }

    public static void main(String[] args) {
        MainFly mainFly = new MainFly();
        mainFly.findFromCity("Wrocław");
       System.out.println();
        mainFly.findToCity("Warszawa");
        System.out.println();
        mainFly.findThrowAnotherCity("Wrocław","Warszawa");
    }
}
