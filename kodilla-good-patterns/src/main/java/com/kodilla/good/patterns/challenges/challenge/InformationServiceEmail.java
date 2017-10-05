package com.kodilla.good.patterns.challenges.challenge;

public class InformationServiceEmail implements InformationService {

    public void inform(User user) {
        System.out.println("Wysyłam e-maila do uzytkownika " + user.getName()+" " +user.getSurname());
    }
}
