package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeShape(final String shapeClass) {
        switch (shapeClass) {
            case DRIVING:
                return new DrivingTask("We are driving", "to Krakow", "by car");
            case PAINTING:
                return new PaintingTask("We are painting", "blue", "images");
            case SHOPPING:
                return new ShoppingTask("We are going shopping", "apples", 10);
            default:
                return null;
        }
    }
}
