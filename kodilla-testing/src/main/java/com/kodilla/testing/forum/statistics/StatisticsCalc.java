package com.kodilla.testing.forum.statistics;

public class StatisticsCalc {

    // pola z sześcioma statystykami
    // statystyki zapamientane w polach klasy

    public int userCount;
    public int postCount;
    public int commentsCount;
    public double averagePostsPerUser;
    public double averageCommentsPerUser;
    public double averageCommentsPerPost;


     public void calculateAdvStatistics(Statistics statistics){
        // metoda przyjmuje typ argumentu Statistics oraz argument o nazwie statistics,
         // inaczej metoda przyjmuje zmjenną statistics o typie Statistics(czyli nasz interfejs)
         //dzieki temu mamy dostęp do metod interfejsu

         userCount = statistics.usersNames().size();
         postCount = statistics.postsCount();
         commentsCount = statistics.commentsCount();
         averagePostsPerUser = postCount/userCount;
         averageCommentsPerUser = (double)commentsCount/userCount;
         averageCommentsPerPost = (double)commentsCount/postCount;
    }
}

