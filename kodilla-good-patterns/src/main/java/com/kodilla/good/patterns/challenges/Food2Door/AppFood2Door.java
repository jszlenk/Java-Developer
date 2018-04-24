package com.kodilla.good.patterns.challenges.Food2Door;

public class AppFood2Door {
    public static void main(String[] args) {
        ResourceRequest resourceRequest = new ResourceRequest();
        Store store = resourceRequest.getManufactureList();
        OrderProcessor orderProcessor = new OrderProcessor(store);
        orderProcessor.getStoreList();
        orderProcessor.display();
    }
}
