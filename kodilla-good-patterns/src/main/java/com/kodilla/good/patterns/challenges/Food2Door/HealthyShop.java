package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop extends Manufacturer {

    HealthyShop(String company, String product, int quantity, double price) {
        super(company, product, quantity, price);
    }

    @Override
    public void process() {
        System.out.print("\n");
        System.out.println(company + ": Thanks for shopping. Effective discount rate of 25% per all.");
        System.out.print("Your product is " + product + " in the amount of " + quantity + " pieces. ");
        discountRate();
        System.out.printf("At a price of: %.2f", price);
        System.out.println(" Euro per item.");
    }

    private void discountRate() {
        if (quantity > 10) {
            price *= 0.75;
        }
    }
}
