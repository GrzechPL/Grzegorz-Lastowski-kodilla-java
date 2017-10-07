package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

//tworzy obiekt klasy ForumUser i umieszcza w kontenerze
@Component

public class ForumUser {

    String username ;

    public String showName() {

        this.username = "John Smith";

        return username;
    }
}
