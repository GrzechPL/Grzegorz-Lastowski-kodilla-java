package com.kodilla.good.patterns.challenges.challenge;

public class OrderRepositoryDataBase implements OrderRepository {

    public void createRental(User user, String orderitem) {

        System.out.println("Wysyłam zamównienie "+ orderitem + " do bazydanych");
    }
}
