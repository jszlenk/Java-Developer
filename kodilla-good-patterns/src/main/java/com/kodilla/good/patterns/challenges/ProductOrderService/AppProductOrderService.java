package com.kodilla.good.patterns.challenges.ProductOrderService;

public class AppProductOrderService {
    public static void main(String[] args) {
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrive();

        OrderProcessor orderProcessor = new OrderProcessor(new OrderServiceClass(), new InformationServiceClass());
        orderProcessor.processOrder(orderRequest);
    }
}
