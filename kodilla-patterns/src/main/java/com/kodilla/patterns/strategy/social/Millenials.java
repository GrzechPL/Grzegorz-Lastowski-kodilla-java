package com.kodilla.patterns.strategy.social;

public class Millenials extends User {

    public Millenials(String name) {
        // super - użyj konstruktora klasy nadrzędnej
        super(name);
        //dla pola z tej klasy socialPublisher stwórz strategie korzystania z Facebooka
        this.socialPublisher = new FacebookPublisher();
    }
}
