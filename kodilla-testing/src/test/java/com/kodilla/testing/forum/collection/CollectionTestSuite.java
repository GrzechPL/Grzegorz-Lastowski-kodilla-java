package com.kodilla.testing.forum.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Test

    public void testOddNumbersExterminatorEmptyLis() {
        //Given
       //co zastalismy ? Liste unsorted do segregacji
        OddNumbersExterminator obj = new OddNumbersExterminator();
        //When
        // co chcemy przetestowac? Lista unsorted == null
        int result = obj.exterminate(ArrayList<Integer>);
        //Then
        //co ma być sprawdzane unsorted ==sorted ==null
        Assert.assertEquals(null, result);
    }
}
