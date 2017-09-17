package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }




        @Test
        public void testListBooksWithConditionMoreThan20() {
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<Book>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                    .thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                    .thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                    .thenReturn(resultListOf40Books);

            // When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
            // Then

            assertEquals(0, theListOfBooks0.size());
            assertEquals(15, theListOfBooks15.size());
            assertEquals(0, theListOfBooks40.size());
        }


    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOf() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        LibraryUser user1 = new LibraryUser("Grzegorz", "Brzeczyszczykiewicz", "1234567");
        Book book1 = new Book("tytul", "autor", 1990);

        //LibraryUser user0 = new LibraryUser("Jan", "Kowalski", "997");
        //Book book0 = new Book();

        LibraryUser user5 = new LibraryUser("Jan", "Paweł", "99783535");
        Book book50 = new Book("abc","zxc",1888);
        Book book51 = new Book("abc","zxc",1888);
        Book book52 = new Book("abc","zxc",1888);
        Book book53 = new Book("abc","zxc",1888);
        Book book54 = new Book("abc","zxc",1888);

        List<Book> resultListOf1Books1 = new ArrayList<>();
        resultListOf1Books1.add(book1);

        //List<Book> resultListOf1Books0 = new ArrayList<>();
        //resultListOf1Books0.add(book0);

        List<Book> resultListOf1Books5 = new ArrayList<>();
        resultListOf1Books5.add(book50);
        resultListOf1Books5.add(book51);
        resultListOf1Books5.add(book52);
        resultListOf1Books5.add(book53);
        resultListOf1Books5.add(book54);


        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(resultListOf1Books1);
        //when(libraryDatabaseMock.listBooksInHandsOf(user0)).thenReturn(resultListOf1Books0);
        when(libraryDatabaseMock.listBooksInHandsOf(user5)).thenReturn(resultListOf1Books5);

        List<Book> oneBooks = bookLibrary.listBooksInHandsOf(user1);
        //List<Book> nullBooks = bookLibrary.listBooksInHandsOf(user0);
        List<Book> fifeBooks = bookLibrary.listBooksInHandsOf(user5);

        assertEquals(1, oneBooks.size());
        //assertEquals(0, nullBooks.size());
        assertEquals(5, fifeBooks.size());

    }



}