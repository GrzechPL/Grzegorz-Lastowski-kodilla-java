package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLastLogSuite() {
        //Given
        Logger.getInstance().getLastLog();
        //When
        String resultlastlog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("", resultlastlog);

    }
    @Test
    public void testLogSuite() {
        //Given
        Logger.getInstance().log();
        //When
        String resultlog = Logger.getInstance().log();
        //Then
        // Do nothing void

    }
}

