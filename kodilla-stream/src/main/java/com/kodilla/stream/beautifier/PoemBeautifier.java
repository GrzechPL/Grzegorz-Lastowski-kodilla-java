package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public static String beautify(String tekst, PoemDecorator poemDecorator) {

        // zmienna tekst przed powiększeniem liter
        System.out.println(tekst);
        //powiększenie liter
        String result = poemDecorator.decorate(tekst);
        //rezultat powiększenia
         System.out.println(result);
         return result;

    }


}

