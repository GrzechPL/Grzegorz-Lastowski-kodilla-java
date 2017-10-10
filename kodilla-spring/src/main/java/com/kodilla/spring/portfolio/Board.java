package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Board {

   TaskList toDoList;
   TaskList inProgressList;
   TaskList doneList;

   public Board(@Qualifier("getToDoList") TaskList toDoList, @Qualifier("getInProgressList") TaskList inProgressList, @Qualifier("getDoneList") TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

}
