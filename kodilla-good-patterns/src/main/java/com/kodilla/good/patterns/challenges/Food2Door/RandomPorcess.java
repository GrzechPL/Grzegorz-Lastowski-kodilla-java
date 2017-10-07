package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Random;

public class RandomPorcess {

    public boolean random(){

        Random generator = new Random();
boolean a = true;
        int choosen = generator.nextInt(2);
        if (choosen == 0) {
            a = false;
        } else if (choosen == 1) {
            a = true;
        }
        return a;
    }
}
