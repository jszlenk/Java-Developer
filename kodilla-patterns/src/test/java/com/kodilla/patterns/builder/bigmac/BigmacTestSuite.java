package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .setRoll(Roll.WITHOUT_SESAME)
                .setBurgers(5)
                .setSauce(Sauce.BARBECUE)
                .setIngredients(Ingredient.BACON, Ingredient.CHILI_PEPPER)
                .build();
        System.out.println(bigmac);

        //When
        String whatRoll = bigmac.getRoll();
        String whatSauce = bigmac.getSauce();
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(Roll.WITHOUT_SESAME, whatRoll);
        Assert.assertEquals(Sauce.BARBECUE, whatSauce);
        Assert.assertEquals(5, howManyBurgers);
        Assert.assertEquals(2, howManyIngredients);
    }
}