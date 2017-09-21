package com.kodilla.stream.world;
import java.math.BigDecimal;

public class Country {
    private String nameOfCountry;
    private BigDecimal numberOfPeople;

    public Country(String nameOfCountry, BigDecimal numberOfPeople) {
        this.nameOfCountry = nameOfCountry;
        this.numberOfPeople = numberOfPeople;
    }

    public BigDecimal getNumberOfPeople() {
        return numberOfPeople;
    }
}