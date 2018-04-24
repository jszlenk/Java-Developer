package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.LinkedHashSet;

public class ResourceRequest {
    private LinkedHashSet<Manufacturer> theManufacturerList = new LinkedHashSet<>();

    public Store getManufactureList() {
        theManufacturerList.add(new ExtraFoodShop("ExtraFoodShop", "Bear", 150, 2.65));
        theManufacturerList.add(new HealthyShop("HealthyShop", "Cucumber", 550, 42.95));
        theManufacturerList.add(new GlutenFreeShop("GlutenFreeShop", "Rye", 250, 12.35));
        return new Store(theManufacturerList);
    }
}
