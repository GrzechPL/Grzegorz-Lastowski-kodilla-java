package com.kodilla.exception.challenge;

public class FirstChallenge {

    //metoda divide zgłaszająca wyjątek

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {

            firstChallenge.divide(3,0);

        }catch (ArithmeticException e){
            System.out.println("Nie dzielimy przez zero");
        }
        finally {
            System.out.println("Nie usuniesz mnie nigdy ");
        }
    }
}