package com.kodilla.patterns.builder.bigmac;

public class Roll {
    public static final String WITH_SESAME = "With Sesame";
    public static final String WITHOUT_SESAME = "Without Sesame";
    private final String rollType;

    public Roll(String rollType) {
        if (rollType.equals(WITH_SESAME) || rollType.equals(WITHOUT_SESAME)) {
            this.rollType = rollType;
        } else {
            throw new IllegalStateException("Roll should be WITH_SESAME or WITHOUT_SESAME!");
        }
    }

    public String getRollType() {
        return rollType;
    }
}
