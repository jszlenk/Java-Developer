package com.kodilla.patterns.builder.bigmac;

public class Sauce {
    public static final String STANDARD = "Standard";
    public static final String THOUSAND_ISLANDS = "1000 Islands";
    public static final String BARBECUE = "Barbecue";
    private final String sauceType;

    public Sauce(String sauceType) {
        if (sauceType.equals(STANDARD) || sauceType.equals(THOUSAND_ISLANDS) || sauceType.equals(BARBECUE)) {
            this.sauceType = sauceType;
        } else {
            throw new IllegalStateException("Sauce should be STANDARD or THOUSAND_ISLANDS or BARBECUE!");
        }
    }

    public String getSauceType() {
        return sauceType;
    }
}
