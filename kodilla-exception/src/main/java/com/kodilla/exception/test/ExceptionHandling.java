package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.5,2);

        }catch (Exception e){
            System.out.println("Zły wpis");
        }
        finally {
            System.out.println("Nie usuniesz mnie nigdy HAHAHA");
        }
    }
}
