package com.kodilla.good.patterns.challenges.ProductOrderService;

public class InformationServiceClass implements InformationService {
    public void informUser(User user) {
        System.out.println("Hallow " + user.getName() + ". Your product has been ordered.");
    }
}
