package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        jeden argument lambda nie trzeba nawiasów()
        poemBeautifier.beautify("powiększam napis", tekst -> tekst.toUpperCase());
        poemBeautifier.beautify("wycinam kawalek tekstu", tekst -> tekst.substring(2,5));
        poemBeautifier.beautify("dodaje moją sygnature na końcu i początku zdania ", tekst -> "G.L "+tekst+" G.L.");

    }


}