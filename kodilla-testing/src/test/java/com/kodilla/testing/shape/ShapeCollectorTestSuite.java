package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("ShapeCollector Test Suite start!");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("ShapeCollector Test Suite end!");
    }

    @Before
    public void before() {
        testCounter++;
        System.out.println("Test nr " + testCounter + " started!");
    }

    @After
    public void after() {
        System.out.println("Test nr " + testCounter + " finished!");
    }

    @Test
    public void testAddCircle() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(25);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertTrue(shapeCollector.getShapes().contains(circle));
        Assert.assertEquals(shapeCollector.getFigure(0), circle);
    }

    @Test
    public void testAddTriangle() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(25, 40);
        //When
        shapeCollector.addFigure(triangle);
        //Then
        Assert.assertTrue(shapeCollector.getShapes().contains(triangle));
        Assert.assertEquals(shapeCollector.getFigure(0), triangle);
    }

    @Test
    public void testAddSquare() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(20);
        //When
        shapeCollector.addFigure(square);
        //Then
        Assert.assertTrue(shapeCollector.getShapes().contains(square));
        Assert.assertEquals(shapeCollector.getFigure(0), square);
    }

    @Test
    public void testRemoveCircle() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(20);
        shapeCollector.addFigure(circle);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertTrue(result);
        Assert.assertFalse(shapeCollector.getShapes().contains(circle));
    }

    @Test
    public void testRemoveTriangle() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(20, 40);
        shapeCollector.addFigure(triangle);
        //When
        boolean result = shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertTrue(result);
        Assert.assertFalse(shapeCollector.getShapes().contains(triangle));
    }

    @Test
    public void testRemoveSquare() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(20);
//        shapeCollector.getShapes().add(square);
        shapeCollector.addFigure(square);
        //When
        boolean result = shapeCollector.removeFigure(square);
        //Then
        Assert.assertTrue(result);
        Assert.assertFalse(shapeCollector.getShapes().contains(square));
    }

    @Test
    public void testGetCircle() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(20);
        shapeCollector.addFigure(circle);
        //When
        Circle result = (Circle) shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle, result);
    }

    @Test
    public void testGetTriangle() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(10, 20);
        shapeCollector.addFigure(triangle);
        //When
        Triangle result = (Triangle) shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(triangle, result);
    }

    @Test
    public void testGetSquare() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(20);
        shapeCollector.addFigure(square);
        //When
        Square result = (Square) shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(square, result);
    }

    @Test
    public void testShowShape() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(10, 10);
        Circle circle = new Circle(10);
        Square square = new Square(10);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        //When
        String shapesName = shapeCollector.showFigures();
        System.out.println("\n" + shapesName);
        //Then
        Assert.assertTrue(shapesName.equals(triangle.getShapeName() + " " + triangle.getField() + "\n" + circle.getShapeName() + " " + circle.getField() + "\n" +
                square.getShapeName() + " " + square.getField() + "\n"));
        Assert.assertEquals(triangle.getShapeName() + " " + triangle.getField() + "\n" + circle.getShapeName() + " " + circle.getField() + "\n" +
                square.getShapeName() + " " + square.getField() + "\n", shapesName);
    }
}