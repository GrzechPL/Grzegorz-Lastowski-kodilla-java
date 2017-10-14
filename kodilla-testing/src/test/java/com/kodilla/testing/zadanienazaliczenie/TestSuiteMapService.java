package com.kodilla.testing.zadanienazaliczenie;

import com.kodilla.testing.zadanienzaliczenie.MapService;
import org.junit.Assert;
import org.junit.Test;
import java.util.Map;
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
        };
        when(mapService.getEntry(index)).thenReturn(entry);

        //When

        int key = mapService.getEntry(index).getKey();
        String value = mapService.getEntry(index).getValue();

        //Then

        Assert.assertEquals(100, key);
        Assert.assertEquals("Object 1", value);

    }
}
