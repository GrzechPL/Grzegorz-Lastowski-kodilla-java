package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    List<String> countryOfEuropa =new ArrayList<>();
    List<String> countryOfAmerika =new ArrayList<>();
    List<String> countryOfAfrika =new ArrayList<>();

    public void addcountry(){
        countryOfEuropa.add("Polska");
        countryOfEuropa.add("Niemcy");
        countryOfEuropa.add("Francja");

        countryOfAmerika.add("USA");
        countryOfAmerika.add("Kanada");
        countryOfAmerika.add("Meksyk");

        countryOfAfrika.add("Kongo");
        countryOfAfrika.add("Kamerun");
        countryOfAfrika.add("Libia");
    }

}
