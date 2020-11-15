package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;


public class ShapeCollectorTestSuite {

    public static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("COLLECTOR TESTS BEGIN:");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("COLLECTOR TESTS END");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("TEST #" + testCounter + " BEGIN");
    }

    @AfterEach
    public void afterEveryTest() {
        System.out.println(testCounter + " FINISHED");
    }

    @Test
    public void testAddFigure() {
        //Given
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        ShapeCollector collector = new ShapeCollector(shapeList);
        //When
        Triangle triangle = new Triangle();
        collector.addFigure(triangle);
        //Then
        Assertions.assertEquals(1, shapeList.size());

    }

    @Test
    public void testRemoveFigures() {
        //Given
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        ShapeCollector collector = new ShapeCollector(shapeList);
        Triangle triangle = new Triangle();
        collector.addFigure(triangle);
        collector.addFigure(triangle);
        //When
        boolean result = collector.removeFigure(triangle);
        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(1, shapeList.size());

    }

    @Test
    public void testRemoveFiguresNotExisting() {
        //Given
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        ShapeCollector collector = new ShapeCollector(shapeList);
        Triangle triangle = new Triangle();
        //When
        boolean result = collector.removeFigure(triangle);
        //Then
        Assertions.assertFalse(result);

    }

    @Test
    public void testGetFigure() {
        //Given
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        ShapeCollector collector = new ShapeCollector(shapeList);
        //When
        Triangle triangle = new Triangle();
        collector.addFigure(triangle);
        Shape result = collector.getFigure(0);
        //Then
        Assertions.assertEquals(triangle, result);

    }

    @Test
    public void testShowFigures() {
        //Given
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        ShapeCollector collector = new ShapeCollector(shapeList);
        Triangle triangle = new Triangle();
        collector.addFigure(triangle);
        //When
        int result = collector.showFigure();
        //Then
        Assertions.assertEquals(1, result);

    }

}
