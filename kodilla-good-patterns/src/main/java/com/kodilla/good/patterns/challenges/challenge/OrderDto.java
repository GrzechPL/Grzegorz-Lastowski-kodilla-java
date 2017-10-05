package com.kodilla.good.patterns.challenges.challenge;

public class OrderDto {

    public User user;
    public Boolean isOrdered;

    public OrderDto(User user, Boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }
}
