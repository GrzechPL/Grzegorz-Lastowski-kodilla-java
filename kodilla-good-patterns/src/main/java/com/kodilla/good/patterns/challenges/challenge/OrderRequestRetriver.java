package com.kodilla.good.patterns.challenges.challenge;

public class OrderRequestRetriver {

    public static OrderRequest retrive(){

        User user1 = new User("Marian","Kusmider");
        String orderitem ="Civilizacja 5 -limited edition";

        return new OrderRequest(user1,orderitem);
    }
}
