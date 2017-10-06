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

        System.out.println("Wszystkie połączenia z " + city);
      for(Flight temp :formcity){
          System.out.println(temp.flightFROM + "-->>" + temp.flightTO);
    }
    }

    public void findToCity(String city){

        List<Flight> formcity =allFly().stream()
                .filter(x->city.equals(x.flightTO))
                .collect(Collectors.toList());
        System.out.println("Wszystkie połączenia do " + city);
        for(Flight temp :formcity){
            System.out.println(temp.flightFROM + "-->>" + temp.flightTO);
        }
    }

    public void findThrowAnotherCity(String city1,String city2,String citythrow){

        List<Flight> formcity1 =allFly().stream()
                .filter(x->citythrow.equals(x.flightTO))
                .filter(x->city1.equals(x.flightFROM))
                .collect(Collectors.toList());
        System.out.println("Połączenie "+ city1+" do "+city2 +" z przesiadką w " +citythrow );
        for(Flight temp :formcity1){
            System.out.println(temp.flightFROM + "-->>" + temp.flightTO);
        }

        List<Flight> formcity2 =allFly().stream()
                .filter(x->citythrow.equals(x.flightFROM))
                .filter(x->city2.equals(x.flightTO))
                .collect(Collectors.toList());
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
        mainFly.findThrowAnotherCity("Wrocław","Warszawa","Poznań");
    }
}
