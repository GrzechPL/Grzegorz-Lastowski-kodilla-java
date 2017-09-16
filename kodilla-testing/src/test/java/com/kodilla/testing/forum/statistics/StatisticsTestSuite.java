package com.kodilla.testing.forum.statistics;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

        @Test
        public void test1StatisticsCalc() {
            //Given

            Statistics statisticMock = mock(Statistics.class);
            StatisticsCalc statisticsCalc = new StatisticsCalc();

            int postcount = 0;
            //int commentsCount = 10;
            List<String> userNames = Arrays.asList("Nazwa1");
            when(statisticMock.postsCount()).thenReturn(postcount);
            //when(statisticMock.commentsCount()).thenReturn(commentsCount);
            when(statisticMock.usersNames()).thenReturn(userNames);


            //When
            statisticsCalc.calculateAdvStatistics(statisticMock);

            //Then
            //Assert.assertEquals(1, statisticsCalc.averageCommentsPerPost, 0.1 );
            //Assert.assertEquals(5, statisticsCalc.averageCommentsPerUser, 0.1 );
            Assert.assertEquals(0, statisticsCalc.averagePostsPerUser, 0.1 );
        }

    @Test
    public void test2StatisticsCalc() {
        //Given

        Statistics statisticMock = mock(Statistics.class);
        StatisticsCalc statisticsCalc = new StatisticsCalc();

        int postcount = 1000;
        //int commentsCount = 10;
        List<String> userNames = Arrays.asList("Nazwa1");
        when(statisticMock.postsCount()).thenReturn(postcount);
        //when(statisticMock.commentsCount()).thenReturn(commentsCount);
        when(statisticMock.usersNames()).thenReturn(userNames);


        //When
        statisticsCalc.calculateAdvStatistics(statisticMock);

        //Then
        //Assert.assertEquals(1, statisticsCalc.averageCommentsPerPost, 0.1 );
        //Assert.assertEquals(5, statisticsCalc.averageCommentsPerUser, 0.1 );
        Assert.assertEquals(1000, statisticsCalc.averagePostsPerUser, 0.1 );
    }

    @Test
    public void test3StatisticsCalc() {
        //Given

        Statistics statisticMock = mock(Statistics.class);
        StatisticsCalc statisticsCalc = new StatisticsCalc();

        //int postcount = 1000;
        int commentsCount = 0;
        List<String> userNames = Arrays.asList("Nazwa1");
        //when(statisticMock.postsCount()).thenReturn(postcount);
        when(statisticMock.commentsCount()).thenReturn(commentsCount);
        when(statisticMock.usersNames()).thenReturn(userNames);


        //When
        statisticsCalc.calculateAdvStatistics(statisticMock);

        //Then
        //Assert.assertEquals(1, statisticsCalc.averageCommentsPerPost, 0.1 );
        Assert.assertEquals(0, statisticsCalc.averageCommentsPerUser, 0.1 );
        //Assert.assertEquals(1000, statisticsCalc.averagePostsPerUser, 0.1 );
    }

    @Test
    public void test4StatisticsCalc() {
        //Given

        Statistics statisticMock = mock(Statistics.class);
        StatisticsCalc statisticsCalc = new StatisticsCalc();

        int postcount = 100;
        int commentsCount = 10;
        List<String> userNames = Arrays.asList("Nazwa1");
        when(statisticMock.postsCount()).thenReturn(postcount);
        when(statisticMock.commentsCount()).thenReturn(commentsCount);
        when(statisticMock.usersNames()).thenReturn(userNames);


        //When
        statisticsCalc.calculateAdvStatistics(statisticMock);

        //Then
        Assert.assertEquals(0.1, statisticsCalc.averageCommentsPerPost, 0.1 );
        Assert.assertEquals(10, statisticsCalc.averageCommentsPerUser, 0.1 );
        Assert.assertEquals(100, statisticsCalc.averagePostsPerUser, 0.1 );
    }

    @Test
    public void test5StatisticsCalc() {
        //Given

        Statistics statisticMock = mock(Statistics.class);
        StatisticsCalc statisticsCalc = new StatisticsCalc();

        int postcount = 10;
        int commentsCount = 100;
        List<String> userNames = Arrays.asList("Nazwa1");
        when(statisticMock.postsCount()).thenReturn(postcount);
        when(statisticMock.commentsCount()).thenReturn(commentsCount);
        when(statisticMock.usersNames()).thenReturn(userNames);


        //When
        statisticsCalc.calculateAdvStatistics(statisticMock);

        //Then
        Assert.assertEquals(10, statisticsCalc.averageCommentsPerPost, 0.1 );
        Assert.assertEquals(100, statisticsCalc.averageCommentsPerUser, 0.1 );
        Assert.assertEquals(10, statisticsCalc.averagePostsPerUser, 0.1 );
    }

    @Test
    public void test6StatisticsCalc() {
        //Given

        Statistics statisticMock = mock(Statistics.class);
        StatisticsCalc statisticsCalc = new StatisticsCalc();

        int postcount = 100;
        //int commentsCount = 10;
        List<String> userNames = Arrays.asList();
        //when(statisticMock.postsCount()).thenReturn(postcount);
        //when(statisticMock.commentsCount()).thenReturn(commentsCount);
        when(statisticMock.usersNames()).thenReturn(userNames);


        //When
        statisticsCalc.calculateAdvStatistics(statisticMock);

        //Then
        //Assert.assertEquals(0.1, statisticsCalc.averageCommentsPerPost, 0.1 );
        //Assert.assertEquals(10, statisticsCalc.averageCommentsPerUser, 0.1 );
        Assert.assertEquals(0, statisticsCalc.averagePostsPerUser, 0.1 );
    }

    @Test
    public void test7StatisticsCalc() {
        //Given

        Statistics statisticMock = mock(Statistics.class);
        StatisticsCalc statisticsCalc = new StatisticsCalc();

        int postcount = 10;
        //int commentsCount = 10;
        List<String> userNames = Arrays.asList("Name1","Name2","Name3","Name4","Name5");
        when(statisticMock.postsCount()).thenReturn(postcount);
        //when(statisticMock.commentsCount()).thenReturn(commentsCount);
        when(statisticMock.usersNames()).thenReturn(userNames);


        //When
        statisticsCalc.calculateAdvStatistics(statisticMock);

        //Then
        //Assert.assertEquals(0.1, statisticsCalc.averageCommentsPerPost, 0.1 );
        //Assert.assertEquals(10, statisticsCalc.averageCommentsPerUser, 0.1 );
        Assert.assertEquals(2, statisticsCalc.averagePostsPerUser, 0.1 );
    }

}


