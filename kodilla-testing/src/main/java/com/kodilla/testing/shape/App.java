package com.kodilla.testing.shape;

public class App {
    public static void main(String[] args) {

        int radius = 25;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius + "\nName shape: " + circle.getShapeName() + "\nResulting Area: " + circle.getField() + "\n");

        double base = 25;
        double height = 40;
        Shape triangle = new Triangle(base, height);
        System.out.println("Triangle base and height is : " + base + " and " + height + "\nName shape: " + triangle.getShapeName() + "\nResulting Area: " + triangle.getField() + "\n");

        int side = 35;
        Shape square = new Square(side);
        System.out.println("Square side: " + side + "\nName shape: " + square.getShapeName() + "\nResulting Area: " + square.getField());
    }
}