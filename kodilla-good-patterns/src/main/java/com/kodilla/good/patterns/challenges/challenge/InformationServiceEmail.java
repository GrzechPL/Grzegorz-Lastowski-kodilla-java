package com.kodilla.good.patterns.challenges.challenge;

public class InformationServiceEmail implements InformationService {

    public void inform(User user) {
        System.out.println("Wysyłąm e-maila dla uzytkownika " + user);
    }
}
