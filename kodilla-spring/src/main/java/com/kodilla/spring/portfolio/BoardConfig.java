package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

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


}
