package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderServiceClass implements OrderService {
    public void createOrder(User user, Order order) {
        System.out.println(user.getName() + " orders " + order.getQuantity() + " " + order.getProduct().getName()
                + ". Total price: " + order.getOrderTotalPrice() + " USD");
    }
}
