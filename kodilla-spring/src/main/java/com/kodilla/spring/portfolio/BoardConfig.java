package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

        @Bean
        public TaskList getToDoList(){

        List<String> task1 = new ArrayList();
        task1.add("Zadanie 1");

        return new TaskList(task1);
        }
        @Bean
        public TaskList getInProgressList(){

                List<String> task2 = new ArrayList();
                task2.add("Zadanie 2");

                return new TaskList(task2);
        }
        @Bean
        public TaskList getDoneList(){

                List<String> task3 = new ArrayList();
                task3.add("Zadanie 3");

                return new TaskList(task3);
        }
        //następuje wstrzyknięcie trzech obiektów do konstruktora klasy Bean
        @Bean
        public Board board(){
                return new Board(getToDoList(),getInProgressList(),getDoneList());
        }
}
