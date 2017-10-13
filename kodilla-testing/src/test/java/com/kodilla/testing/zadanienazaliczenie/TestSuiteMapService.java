package com.kodilla.testing.zadanienazaliczenie;

import com.kodilla.testing.zadanienzaliczenie.MapCalc;
import com.kodilla.testing.zadanienzaliczenie.MapService;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestSuiteMapService {

    @Test
    public void testCalculateMapServiceWithMock() {
        //Given
        MapService mapService = mock(MapService.class);
        HashMap<Integer, String> mapservice = new HashMap<Integer, String>();
        mapservice.put(100, "Object 1");

        when(mapService.getEntry(1)).thenReturn((Map.Entry<Integer, String>) mapservice);

        MapCalc mapCalc = new MapCalc(mapService);

        //When
        Map<Integer,String> mapa = mapCalc.calculateMapService(1);
        System.out.println(mapa);

    }
}
