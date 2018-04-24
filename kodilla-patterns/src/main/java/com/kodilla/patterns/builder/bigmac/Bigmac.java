package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    private Bigmac(String roll, int burgers, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<String>(ingredients);
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public static class BigMacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();


        public BigMacBuilder setRoll(String roll) {
            this.roll = roll;
            return this;
        }

        public BigMacBuilder setBurgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder setIngredients(String... ingredient) {
            ingredients.addAll(Arrays.asList(ingredient));
            return this;
        }

        public Bigmac build() {
            if (roll == null) {
                throw new IllegalStateException("There is no roll specified!");
            }
            if (burgers <= 0) {
                throw new IllegalStateException("There is no quantity burgers specified");
            }
            if (sauce == null) {
                throw new IllegalStateException("There is no sauce specified");
            }
            if (ingredients.isEmpty()) {
                throw new IllegalStateException("There is no ingredients specified");
            }

            return new Bigmac(roll, burgers, sauce, ingredients);
        }
    }

    @Override
    public String toString() {
        return "My Bigmac {" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
