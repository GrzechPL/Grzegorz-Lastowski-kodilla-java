package com.kodilla.stream.world.com.kodilla.stream.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testGetPeopleQuantity(){
        //Given
       int[] numbers = {5,10,15};
        //When
        double result = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(10,result,0.1);
    }



}
