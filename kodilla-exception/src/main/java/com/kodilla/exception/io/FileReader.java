package com.kodilla.exception.io;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile()
    {
        //ClassLoader odpowiada za odnalezienie klas i plików w naszej aplikacji
        ClassLoader classLoader = getClass().getClassLoader();

        //tworzy obiekt file klasy File i umieszcza tam ścieżeke do pliku z danymi, oraz tworzy chwytak -getFile
        File file = new File(classLoader.getResource("file/names.txt").getFile());
        Path path = Paths.get(file.getPath());
        Stream<String> fileLines = Files.lines(path);
    }
}
