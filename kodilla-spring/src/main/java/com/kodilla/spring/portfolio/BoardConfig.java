package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

        @Bean
        public TaskList getToDoList(){
        return new TaskList(new ArrayList<>());
        }
        @Bean
        public TaskList getInProgressList(){
                return new TaskList(new ArrayList<>());
        }
        @Bean
        public TaskList getDoneList(){
                return new TaskList(new ArrayList<>());
        }
        //następuje wstrzyknięcie trzech obiektów do konstruktora klasy Bean
        @Bean
        public Board board(){
                return new Board(getToDoList(),getInProgressList(),getDoneList());
        }
}
