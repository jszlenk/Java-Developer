package com.kodilla.good.patterns.challenges.FlySystem;

import java.util.List;

public class AppFly {
    public static void main(String[] args) {

        FlyRepository flyRepository = new FlyRepository();
        FlyProcessor flyProcessor = new FlyProcessor(flyRepository);
        FlyDisplay flyDisplay = new FlyDisplay();

        List listFrom = flyProcessor.getFromFly("Gdańsk");
        List listTo = flyProcessor.getToFly("Warszawa");
        List listThrough1 = flyProcessor.getThroughFly1Param("Warszawa");
        List listThrough2 = flyProcessor.getThroughFly2Param("Gdańsk", "Poznań");
        List listThrough3 = flyProcessor.getThroughFly3Param("Gdańsk", "Poznań", "Warszawa");

        flyDisplay.display(listFrom);
        flyDisplay.display(listTo);
        flyDisplay.display(listThrough1);
        flyDisplay.display(listThrough2);
        flyDisplay.display(listThrough3);
    }
}
