package com.kodilla.testing.zadanienazaliczenie;

import com.kodilla.testing.zadanienzaliczenie.MapService;
import org.junit.Assert;
import org.junit.Test;
import java.util.Map;

import static org.mockito.Mockito.RETURNS_SMART_NULLS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestSuiteMapService {

    @Test
    public void testCalculateMapServiceWithMock() {

        //Given

        MapService mapService = mock(MapService.class);
        int index = 1;
        Map.Entry<Integer, String> entry = new Map.Entry<Integer, String>() {
            @Override
            public Integer getKey() {
                return 100;
            }
            @Override
            public String getValue() {
                return "Object 1";
            }
            @Override
            public String setValue(String value) {
                return "Object 1";
            }
            @Override
            public String toString() {
                return "[" +  getKey() + " : " + getValue() + "]";
            }
        };
        when(mapService.getEntry(index)).thenReturn(entry);
        //When
        Map.Entry<Integer,String> result = mapService.getEntry(index);
        //Then
        Assert.assertEquals(entry, result);
    }
}
