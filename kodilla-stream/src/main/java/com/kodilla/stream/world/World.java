package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//Klasa świat ma zawierać kolekcje kontynentów

public class World {

    private final List<Continent> listOfContinent = new ArrayList<>();

    public void addContinent(Continent continent){
        listOfContinent.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        //wchodzący stream kolekcja kontynentów z krajam
        return listOfContinent.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                // po spłszczeniu mamy same państwa
                .map(Country::getNumberOfPeople)
                //przekształcamy państwa na odpowiednie wartości ludności
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        //kolektor skalarny sumuje nam ludność wszystkich krajów warość początkowa 0,
        // sum wartość poprzednia, current wartośc aktulana
    }
}
