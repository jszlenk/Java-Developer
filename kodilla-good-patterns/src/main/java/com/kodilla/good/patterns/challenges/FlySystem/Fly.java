package com.kodilla.good.patterns.challenges.FlySystem;

import java.util.Objects;

public class Fly implements FlyInterface {
    private String to;
    private String from;

    Fly(String from, String to) {
        this.to = to;
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fly fly = (Fly) o;
        return Objects.equals(to, fly.to) &&
                Objects.equals(from, fly.from);
    }

    @Override
    public int hashCode() {
        int result = from.hashCode();
        result = 31 * result + to.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "From " + from + " to " + to + ", ";
    }
}
