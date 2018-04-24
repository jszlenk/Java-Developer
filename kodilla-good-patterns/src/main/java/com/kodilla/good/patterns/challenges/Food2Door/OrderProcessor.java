package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.LinkedHashSet;

public class OrderProcessor {

    private Store store;
    private LinkedHashSet<Manufacturer> theStoreList = new LinkedHashSet<>();

    OrderProcessor(Store store) {
        this.store = store;
    }

    public void getStoreList() {
        this.theStoreList = store.getTheProviderList();
    }

    public void display() {
        theStoreList.forEach(Manufacturer::process);
    }
}
