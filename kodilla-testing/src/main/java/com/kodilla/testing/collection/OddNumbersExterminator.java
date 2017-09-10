package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    //metoda musi zwracać kolekcje
    public ArrayList<Integer> exterminate(ArrayList<Integer> templist) {

        ArrayList<Integer> sortedlist = new ArrayList<Integer>();

        for (int integrator: templist) {
            if (integrator % 2 == 0) {
               sortedlist.add(integrator);
            }
        }
          return sortedlist;

    }

}


