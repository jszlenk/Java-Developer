package com.kodilla.good.patterns.challenges.FlySystem;

import java.util.List;

public class FlyDisplay {
    public void display(List city) {
        System.out.println("Your Journey: ");

        if (city.isEmpty()) {
            System.out.println("No results found for your search.");
        }

        for (Object directions : city) {
            System.out.print(directions);
        }
        System.out.println(" \n");
    }
}
