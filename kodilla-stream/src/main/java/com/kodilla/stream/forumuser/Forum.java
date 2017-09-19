package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    //poza metodą mogą być tylko zmienne,pola
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        ForumUser forumUser1 = new ForumUser(0001, "Jan Kowalski", 'M', LocalDate.of(1978, 9, 24), 0);
        ForumUser forumUser2 = new ForumUser(0002, "Weronika Dudek", 'K', LocalDate.of(1999, 11, 23), 0);
        ForumUser forumUser3 = new ForumUser(0003, "Andrzej Buła", 'M', LocalDate.of(1976, 2, 13), 55);
        ForumUser forumUser4 = new ForumUser(0004, "Ilona Głaz", 'K', LocalDate.of(1977, 5, 26), 10);
        ForumUser forumUser5 = new ForumUser(0005, "Ichman Rabin", 'M', LocalDate.of(2001, 11, 11), 6);

        forumUserList.add(forumUser1);
        forumUserList.add(forumUser2);
        forumUserList.add(forumUser3);
        forumUserList.add(forumUser4);
        forumUserList.add(forumUser5);
    }
    public List<ForumUser> getUserList(){
      //tworzymy kopie listy aby zapobiec mutowaniu obiektów przez użytkownika
        return new ArrayList<ForumUser>(forumUserList);
    }

}
