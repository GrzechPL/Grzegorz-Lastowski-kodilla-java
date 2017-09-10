package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.*;

import java.util.ArrayList;

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
        ArrayList<String> figures = new ArrayList<>();

        //When
        figures.add("Square");

        //Then
        ShapeCollector obj = new ShapeCollector();
        Assert.assertEquals("Square", obj.addFigure());
    }
}
