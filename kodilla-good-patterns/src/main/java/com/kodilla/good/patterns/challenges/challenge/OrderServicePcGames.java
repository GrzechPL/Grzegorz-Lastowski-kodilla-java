package com.kodilla.good.patterns.challenges.challenge;

public class OrderServicePcGames implements OrderService {

    public boolean rent(User user, String orderitem) {

        System.out.println("Zamównienie " + orderitem + " dla użytkownika " + user.getName()+" "+user.getSurname());

        return true;
    }
}
