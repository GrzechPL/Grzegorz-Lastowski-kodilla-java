package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){

        //Given

        Book book1 = new Book("Ksiązka 1","Autor 1", LocalDate.of(2000,01,10));
        Book book2 = new Book("Ksiązka 2","Autor 2", LocalDate.of(2010,02,15));
        Book book3 = new Book("Ksiązka 3","Autor 3", LocalDate.of(2020,03,20));

        Library library = new Library("Biblioteka Główna");

        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);

        //making a shallow copy of object board

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Bibloteka po płytkim klonowaniu");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Biblioteka po głębokim klonowaniu");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.books.remove(book1);

        //Then
        Assert.assertEquals(2, library.books.size());
        Assert.assertEquals(2, clonedLibrary.books.size());
        Assert.assertEquals(3, deepClonedLibrary.books.size());
        Assert.assertEquals(clonedLibrary.books, library.books);
        Assert.assertNotEquals(deepClonedLibrary.books, library.books);

        //Print
        System.out.println(library.name+library.getBooks());
        System.out.println(clonedLibrary.name+clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.name+deepClonedLibrary.getBooks());
    }
}
