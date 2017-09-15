import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCalc;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void testStatisticsCalc() {
        //Given

        Statistics statisticMock = mock(Statistics.class);
        StatisticsCalc statisticsCalc = new StatisticsCalc(statisticMock);

        int postcount = 0;
        when(statisticMock.postsCount()).thenReturn(postcount);


        //When
        int first = statisticsCalc.calculateAdvStatistics();

        //Then
        Assert.assertEquals(0,first );
    }
}
