package com.kodilla.testing.forum.statistics;

import java.util.*;

public class StatisticsCalc {

    private final Statistics statistics;
    Statistics statistic;

    public StatisticsCalc(Statistics statistics) {
        this.statistics = statistics;
    }
    LinkedList<String> names = new LinkedList<String>();
    int numberOfPosts;
    int numberOfComments;


     StatisticsCalc calculateAdvStatistics(Statistics statistics){

        int numberOfUsers = names.size();
        double averagePostsPerUser = numberOfPosts/numberOfUsers;
        double averageCommentsPerUser = numberOfComments/numberOfUsers;
        double averageCommentsPerPost =numberOfComments/numberOfPosts;

        return LinkedList;
    }
}

