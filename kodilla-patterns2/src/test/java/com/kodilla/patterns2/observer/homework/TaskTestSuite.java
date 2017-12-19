package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskTestSuite {

    @Test
    public void testUpdate(){
        //Given
        Task userDE = new UserFromDE();
        Task userPL = new UserFromPL();

        Mentor tomy = new Mentor("Lazy","Tomy");
        Mentor greg = new Mentor("Smart","Greg");

        userDE.registerObserver(tomy);
        userDE.registerObserver(greg);
        userPL.registerObserver(greg);

        //When
        userPL.addTask("Task 1");
        userDE.addTask("Task 2");
        userPL.addTask("Task 3");
        userDE.addTask("Task 4");
        userPL.addTask("Task 5");
        userPL.addTask("Task 6");

        //Then
        assertEquals(2,tomy.getUpdateCount());
        assertEquals(6,greg.getUpdateCount());
    }

}
