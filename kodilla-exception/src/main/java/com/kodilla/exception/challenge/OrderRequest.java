package com.kodilla.exception.challenge;

public class OrderRequest {

public User user;
public String orderitem;

    public OrderRequest(User user, String orderitem) {
        this.user = user;
        this.orderitem = orderitem;
    }

    public User getUser() {
        return user;
    }

    public String getOrderitem() {
        return orderitem;
    }


}
