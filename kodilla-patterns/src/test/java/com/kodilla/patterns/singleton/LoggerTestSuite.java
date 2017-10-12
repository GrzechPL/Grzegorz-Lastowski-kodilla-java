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
        Assert.assertEquals("Logowanie testowe", resultlastlog);

    }
    @Test
    public void testLogSuite() {
        //Given,When
        Logger.getInstance().log("Logowanie testowe");
        //Then
        // Do nothing void

    }
}

