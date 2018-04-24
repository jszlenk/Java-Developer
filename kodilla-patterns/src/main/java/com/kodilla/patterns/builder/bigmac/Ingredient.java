package com.kodilla.patterns.builder.bigmac;

import java.util.List;

public class Ingredient {
    public static final String LETTUCE = "Lettuce";
    public static final String ONION = "Onion";
    public static final String BACON = "Bacon";
    public static final String CUCUMBER = "Cucumber";
    public static final String CHILI_PEPPER = "Chili Pepper";
    public static final String MUSHROOMS = "Mushrooms";
    public static final String SHRIMPS = "Shrimps";
    public static final String CHEESE = "Cheese";
    private final List IngredientType;

    public Ingredient(List IngredientType) {
        if (IngredientType.equals(LETTUCE) || IngredientType.equals(ONION) || IngredientType.equals(BACON) ||
                IngredientType.equals(CUCUMBER) || IngredientType.equals(CHILI_PEPPER) || IngredientType.equals(MUSHROOMS) ||
                IngredientType.equals(SHRIMPS) || IngredientType.equals(CHEESE)) {
            this.IngredientType = IngredientType;
        } else {
            throw new IllegalStateException("Sauce should be STANDARD or THOUSAND_ISLANDS or BARBECUE!");
        }
    }
    public List getIngredientType() {
        return IngredientType;
    }
}
