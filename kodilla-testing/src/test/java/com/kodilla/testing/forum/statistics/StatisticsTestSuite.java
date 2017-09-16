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

        int postcount = 1230;
        int commentsCount = 27;
        List<String> userNames = Arrays.asList("Nazwa1", "Nazwa2","Nazwa3");
        when(statisticMock.postsCount()).thenReturn(postcount);
        when(statisticMock.commentsCount()).thenReturn(commentsCount);
        when(statisticMock.usersNames()).thenReturn(userNames);


        //When
        statisticsCalc.calculateAdvStatistics(statisticMock);

        //Then
        Assert.assertEquals(0.021, statisticsCalc.averageCommentsPerPost, 0.001 );
        Assert.assertEquals(9, statisticsCalc.averageCommentsPerUser, 0.1 );
        Assert.assertEquals(410, statisticsCalc.averagePostsPerUser, 0.1 );
    }
}
