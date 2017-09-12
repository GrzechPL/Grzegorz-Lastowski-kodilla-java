package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.*;

//Test suite for classes of Forum
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {

            //Given
            ShapeCollector obj = new ShapeCollector();
            //When
            Square squ = new Square(25);
            obj.addFigure(squ);
            //Then
            Assert.assertEquals("Square", obj.getFigure(0).getShapeName());
            Assert.assertEquals(25, obj.getFigure(0).getField(), 0.01);
    }

    @Test
    public void testRemoveFigure() {

        //Given
        ShapeCollector obj = new ShapeCollector();

        //When
        Circle cir = new Circle(50);
        obj.addFigure(cir);
        obj.removeFigure(cir);

        //Then
        Assert.assertEquals(0, obj.figures.size());
    }

    @Test
    public void testGetFigure() {

        //Given
        ShapeCollector obj = new ShapeCollector();

        //When
        Circle cir =new Circle(50);
        obj.addFigure(cir);

        //Then
        Assert.assertEquals("Circle", obj.getFigure(0).getShapeName());
    }
}

