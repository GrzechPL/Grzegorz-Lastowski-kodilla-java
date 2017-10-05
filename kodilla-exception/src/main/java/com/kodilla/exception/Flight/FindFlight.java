package com.kodilla.exception.Flight;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public boolean mapFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> hashMap = new HashMap<>();

        hashMap.put("Warszawa", true);
        hashMap.put("London", true);
        hashMap.put("Moscow", false);
        hashMap.put("Zielona Góra", true);
        hashMap.put("Inglostadt", true);

        boolean result = false;

        for (Map.Entry<String, Boolean> entry : hashMap.entrySet()) {
            if (flight.getArrivalAirport().equals(entry.getKey()))
            {
                result = entry.getValue();
                break;
            }
            else
            {
                throw new RouteNotFoundException();
            }
        }
        return result;
    }


    public static void main(String[] args) {

        FindFlight findFlight = new FindFlight();
        boolean filght = false;
        try {
            filght = findFlight.mapFilght(new Flight("Warszawa", "Gdańsk"));
        } catch (RouteNotFoundException e) {
            System.out.println("Lotnisko nie jest na liście ");
        }
        System.out.println("Czy da się lecieć na to lotnisko? " + filght);

    }
}



