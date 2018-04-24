package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderRequest {
    private User user;
    private Product product;
    private Order order;

    public OrderRequest(User user, Product product, Order order) {
        this.user = user;
        this.product = product;
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Order getOrder() {
        return order;
    }
}
