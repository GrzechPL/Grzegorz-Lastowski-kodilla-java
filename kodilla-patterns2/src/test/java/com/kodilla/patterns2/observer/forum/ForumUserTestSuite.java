package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate(){
        //Given
    ForumTopic javaHelpForum = new JavaHelpForumTopic();
    ForumTopic javaToolsForum = new JavaToolsForumTopic();

    ForumUser john = new ForumUser("John Smith");
    ForumUser tom = new ForumUser("Tom Hanks");
    ForumUser jan = new ForumUser("Jan Kolbe");

        javaHelpForum.registerObserver(john);
        javaHelpForum.registerObserver(tom);
        javaToolsForum.registerObserver(tom);
        javaToolsForum.registerObserver(jan);
        //When
        javaHelpForum.addPost("Hi everybody first");
        javaHelpForum.addPost("Hi everybody second");
        javaToolsForum.addPost("Hi everybody third");
        javaHelpForum.addPost("Hi everybody four");
        javaToolsForum.addPost("Hi everybody five");
        //Then
        assertEquals(3,john.getUpdateCount());
        assertEquals(5,tom.getUpdateCount());
        assertEquals(2,jan.getUpdateCount());
    }
}
