package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderToDo {
    private User user;
    private boolean isRented;

    public OrderToDo(User user, boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public User getUser() {
        return user;
    }

    public boolean isRented() {
        return isRented;
    }
}
