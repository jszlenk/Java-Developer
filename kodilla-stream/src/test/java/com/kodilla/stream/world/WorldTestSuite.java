package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        //Given
        Country Poland = new Country(new BigDecimal(39));
        Country Germany = new Country(new BigDecimal(89));
        Country France = new Country(new BigDecimal(67));

        Continent europa = new Continent();
        europa.addCountry(Poland);
        europa.addCountry(Germany);
        europa.addCountry(France);

        Country Russia = new Country(new BigDecimal(139));
        Country China = new Country(new BigDecimal(1334));
        Country Japan = new Country(new BigDecimal(127));

        Continent asia = new Continent();
        asia.addCountry(Russia);
        asia.addCountry(China);
        asia.addCountry(Japan);

        Country USA = new Country(new BigDecimal(336));
        Country Canada = new Country(new BigDecimal(39));
        Country Mexico = new Country(new BigDecimal(167));

        Continent america = new Continent();
        america.addCountry(USA);
        america.addCountry(Canada);
        america.addCountry(Mexico);

        //When
        World world = new World();
        world.addContinent(europa);
        world.addContinent(asia);
        world.addContinent(america);

        BigDecimal expected = new BigDecimal(2337);
        BigDecimal result = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(expected, result);
    }
}
