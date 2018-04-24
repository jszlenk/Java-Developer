package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Random;

public class ExtraFoodShop extends Manufacturer {

    ExtraFoodShop(String company, String product, int quantity, double price) {
        super(company, product, quantity, price);
    }

    @Override
    public void process() {
        System.out.print("\n");
        connectError();
    }

    private void connectError() {
        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println(company + ": The transaction has been canceled.");
        } else {
            System.out.println(company + ": Thanks for shopping.");
            System.out.print("Your product is " + product + " in the amount of " + quantity + " pieces. ");
            System.out.printf("At a lower price than the market price: %.2f", price);
            System.out.println(" Euro.");
        }
    }
}
