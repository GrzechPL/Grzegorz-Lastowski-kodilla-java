package com.kodilla.stream.array;
import java.util.stream.IntStream;
public  interface ArrayOperations
{
    //statyczna metoda umożliwia budowe kodu "ciała metody" w interfejsach
     static double getAverage(int numbers[])
     {
         IntStream.range(0,numbers.length)
                 .map(a->numbers[a])
                 .forEach(System.out::println);
         double average = IntStream.range(0,numbers.length)
                 //mapowanie transformacja z licznika elementów tabliczy do wartości konkretnego argumentu tablicy
                 //użycie getAsDouble aby powrócić do dobuble po metodzie average
                 .map(t->numbers[t])
                 .average().getAsDouble();
         System.out.println("\nśrednia wynosi "+average);
         return average;
     }
}