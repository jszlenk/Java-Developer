package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop extends Manufacturer {

    GlutenFreeShop(String company, String product, int quantity, double price) {
        super(company, product, quantity, price);
    }

    @Override
    public void process() {
        System.out.print("\n");
        extraBonus();
        System.out.printf("At a price: %.2f", price);
        System.out.println(" Euro.");
    }

    private void extraBonus() {
        System.out.println(company + ": Thanks for shopping.");
        System.out.printf("Your product is " + product + " in the extra bonus amount of %.0f", (quantity * 2.5));
        System.out.println(" pieces.");
    }

}
