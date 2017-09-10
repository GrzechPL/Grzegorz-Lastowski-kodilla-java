package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;

public class TestingMain {
    public static void main(String[] args) {

        ArrayList<Integer> unsortedlist = new ArrayList<Integer>();
        for(int i=0; i<10;i++){
            unsortedlist.add(i);
        }

        OddNumbersExterminator exe = new OddNumbersExterminator();
        exe.exterminate(unsortedlist);
    }
}