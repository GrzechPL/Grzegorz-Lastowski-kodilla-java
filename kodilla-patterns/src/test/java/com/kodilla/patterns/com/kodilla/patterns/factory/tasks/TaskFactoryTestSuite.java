package com.kodilla.patterns.com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
            //??? TaskFactory.SHOPPINGTASK ???
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Zakupy w EuroAGD 1.0 pralka", shopping.executeTask());
        Assert.assertEquals("Zakupy w EuroAGD", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());

    }
    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Malowaniwe sciany niebieski", painting.executeTask());
        Assert.assertEquals("Malowaniwe", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());

    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Wakacje kreta  samochód",driving.executeTask());
        Assert.assertEquals("Wakacje", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted());

    }

}
