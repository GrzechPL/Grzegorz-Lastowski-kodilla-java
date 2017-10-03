package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b){
        return a / b;

    try
        {
        return a / b;
        }
    catch(ArithmeticException e)
        {
            System.out.println("Nie dzielimy przez zero"+e);
        }
    finally
    {
        System.out.println("Wykonuje sie zawsze");
    }
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}