package com.kodilla.spring;

import com.kodilla.spring.portfolio.Board;
import com.kodilla.spring.portfolio.BoardConfig;
import com.kodilla.spring.portfolio.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        List<String> task1 = new LinkedList<>();
        task1.add("Zadanie 1");
        List<String> task2 = new LinkedList<>();
        task2.add("Zadanie 2");
        List<String> task3 = new LinkedList<>();
        task3.add("Zadanie 3");

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        Board board = context.getBean(Board.class);

        board.getToDoList().setTasks(task1);
        board.getDoneList().setTasks(task2);
        board.getInProgressList().setTasks(task3);

        //When
        String restult1 = board.getToDoList().getTasks().get(0);
        String restult2 = board.getDoneList().getTasks().get(0);
        String restult3 = board.getInProgressList().getTasks().get(0);

        //Then
        Assert.assertEquals("Zadanie 1", restult1);
        Assert.assertEquals("Zadanie 2", restult2);
        Assert.assertEquals("Zadanie 3", restult3);


    }
}
