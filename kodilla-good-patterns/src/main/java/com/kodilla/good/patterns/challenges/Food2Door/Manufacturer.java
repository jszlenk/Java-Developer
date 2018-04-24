package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Objects;

public abstract class Manufacturer {
    String company;
    String product;
    int quantity;
    double price;

    Manufacturer(String company, String product, int quantity, double price) {
        this.company = company;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public abstract void process();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return quantity == that.quantity &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(company, that.company) &&
                Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, product, quantity, price);
    }
}
