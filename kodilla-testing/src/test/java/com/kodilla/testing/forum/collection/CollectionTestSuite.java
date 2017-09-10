package com.kodilla.testing.forum.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin -->");
    }

     @After
     public void after() {
         System.out.println("Test Case: end  <--");
     }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin ---->");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end  <----");
    }

    @Test

    public void testOddNumbersExterminatorNormalList() {

        // Given
        // Sytuacja wejściowa(przed wykonaniem testu) kolekcja parzysta, nieparzysta

        ArrayList<Integer> oddEven = new ArrayList<Integer>();
        oddEven.add(0);
        oddEven.add(1);
        oddEven.add(2);
        oddEven.add(3);
        oddEven.add(4);
        oddEven.add(5);
        oddEven.add(6);
        oddEven.add(7);
        oddEven.add(8);
        oddEven.add(9);

        // When
        // Zdarzenie które testujemy czyli umieszczenie list odd i even  w metodzie exterminate

        OddNumbersExterminator obj = new OddNumbersExterminator();
        ArrayList<Integer> resultsOddEven = obj.exterminate(oddEven);

        //Then
        //warunki które maja być spełnione aby test był prawdziwy

        ArrayList<Integer> even = new ArrayList<Integer>();
        even.add(0);
        even.add(2);
        even.add(4);
        even.add(6);
        even.add(8);

        Assert.assertEquals(even,resultsOddEven);

    }

    @Test

    public void testOddNumbersExterminatorEmptyList() {

        // Given

        ArrayList<Integer> empty = new ArrayList<Integer>();

        // When

        OddNumbersExterminator obj = new OddNumbersExterminator();
        ArrayList<Integer> resultsEmpty = obj.exterminate(empty);

        //Then

        Assert.assertEquals(empty,resultsEmpty);

    }



}
