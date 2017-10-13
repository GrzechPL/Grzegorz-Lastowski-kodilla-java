package com.kodilla.testing.zadanienzaliczenie;

import java.util.Map;

public interface MapService {

    //para klucz-wartość
    Map.Entry<Integer, String> getEntry(int objectIndex);
}