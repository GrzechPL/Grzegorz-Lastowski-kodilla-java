package com.kodilla.stream.forumuser;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        //inicjalizacja stream
        forum.getUserList().stream()
                //operacje filtrujące
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() < 1997 )
                .filter(forumUser -> forumUser.getPostCounter() > 0)
                .forEach(System.out::println);

    }
}