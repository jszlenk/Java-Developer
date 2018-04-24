package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderRequestRetriver {
    public OrderRequest retrive() {
        User user = new User("Jacob");
        Product product = new Product("House slippers", 25);
        Order order = new Order(product, 10);

        return new OrderRequest(user, product, order);
    }
}
