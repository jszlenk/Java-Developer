package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.LinkedHashSet;

public class Store {
    private LinkedHashSet<Manufacturer> theProviderList;

    Store(LinkedHashSet<Manufacturer> theProviderList) {
        this.theProviderList = theProviderList;
    }

    public LinkedHashSet<Manufacturer> getTheProviderList() {
        return new LinkedHashSet<>(theProviderList);
    }
}
