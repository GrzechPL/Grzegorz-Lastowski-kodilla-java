package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public void exterminate(ArrayList<Integer> templist) {

        ArrayList<Integer> sortedlist = new ArrayList<Integer>();

        for (int integrator: templist) {
            if (integrator % 2 == 0) {
               sortedlist.add(integrator);
            }
        }
        for (int integrator :sortedlist){
            System.out.println(integrator);
        }
    }

}

