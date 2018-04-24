package com.kodilla.testing.shape;

public class Circle implements Shape {

    private final double radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getField() {
        double pi = Math.PI;
        return (int) (pi * Math.pow(radius, 2));
    }
}