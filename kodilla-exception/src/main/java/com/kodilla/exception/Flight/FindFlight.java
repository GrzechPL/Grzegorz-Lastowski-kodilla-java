package com.kodilla.exception.Flight;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public void findFilght(Flight flight) {

        Map<String, Boolean> hashMap = new HashMap<>();

        hashMap.put("Warsaw",true);
        hashMap.put("London",false);
        hashMap.put("Moscow",false);
        hashMap.put("Zielona Góra",true);
        hashMap.put("Inglostadt",false);

    }
    public static void main(String[] args) {

    }
}
