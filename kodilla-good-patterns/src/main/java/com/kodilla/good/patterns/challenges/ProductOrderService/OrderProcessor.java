package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderProcessor {
    private OrderService orderService;
    private InformationService informationService;

    public OrderProcessor(final OrderService orderService, final InformationService informationService) {
        this.orderService = orderService;
        this.informationService = informationService;
    }

    public OrderToDo processOrder(OrderRequest orderRequest) {
        boolean isOrdered = orderRequest.getOrder().getQuantity() > 0;
        if (isOrdered) {
            orderService.createOrder(orderRequest.getUser(), orderRequest.getOrder());
            informationService.informUser(orderRequest.getUser());
            return new OrderToDo(orderRequest.getUser(), true);
        } else {
            System.out.println("Order is empty");
            return new OrderToDo(orderRequest.getUser(), false);
        }
    }
}
