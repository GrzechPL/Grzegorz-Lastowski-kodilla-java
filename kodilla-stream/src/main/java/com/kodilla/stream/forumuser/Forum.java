package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();


    ForumUser forumUser1 =new ForumUser(0001,"Jan Kowalski",'M',1978,6,24,0);
    ForumUser forumUser2 =new ForumUser(0002,"Weronika Dudek",'K',1988,7,14,0);
    ForumUser forumUser3 =new ForumUser(0003,"Andrzej Buła",'M',1948,5,5,55);
    ForumUser forumUser4 =new ForumUser(0004,"Ilona Głaz",'K',1998,3,6,10);
    ForumUser forumUser5 =new ForumUser(0005,"Ichman Rabin",'M',2001,12,4,6);

    forumUserList.add(forumUser1);

}
