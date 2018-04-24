package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal peopleQuatity;

    public Country(final BigDecimal peopleQuatity) {
        this.peopleQuatity = peopleQuatity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuatity;
    }
}