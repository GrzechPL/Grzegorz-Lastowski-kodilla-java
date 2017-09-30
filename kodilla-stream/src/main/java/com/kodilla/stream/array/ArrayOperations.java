package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public  interface ArrayOperations {

    //statyczna metoda umożliwia budowe kodu "ciała metody" w interfejsach
     static OptionalDouble getAverage(int numbers[])

     {
         IntStream.range(0,numbers.length)
                //operacja terminalna nic nie zwracajaca forEach
                //przykład uzycia referacji metody statycznej println zamiast wyrażenia lambda
                 .forEach(System.out::print);

         //co to jest OptionalDouble, przy zwykłym double nie zadziała ???
         OptionalDouble average = IntStream.range(0,numbers.length)
                 .average();

         return average;
     }

}
