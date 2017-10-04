package com.kodilla.exception.Flight;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public boolean findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> hashMap = new HashMap<>();

        hashMap.put("Warsaw", true);
        hashMap.put("London", false);
        hashMap.put("Moscow", false);
        hashMap.put("Zielona Góra", true);
        hashMap.put("Inglostadt", false);

        for (Map.Entry<String, Boolean> entry = hashMap.entrySet()) {
            if (flight.getArrivalAirport()!=entry.getKey()) {
                throw new RouteNotFoundException();
            }
        }
        return true;
    }

    public static void main(String[] args) {
        FindFlight findFlight = new FindFlight();
        boolean filght = false;
        try {
            filght = findFlight.findFilght(new Flight("Warszawa", "Gdańsk"));
        } catch (RouteNotFoundException e) {
            System.out.println("Nie znaleziono lotniska");
        }
        System.out.println("Czy da się lecieć na to lotnisko? " + filght);

    }
}


