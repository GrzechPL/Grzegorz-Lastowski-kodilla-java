package com.kodilla.testing.forum.statistics;

import java.util.LinkedList;
import java.util.List;

public interface Statistics {
    //lista metod przez które bede pobierał dane

    LinkedList<String> usersNames(); // list of users names
    int postsCount();          // total quantity of forum posts
    int commentsCount();       // total quantity of forum comments
}
