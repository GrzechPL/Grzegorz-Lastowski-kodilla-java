package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite{
   @Test
    public void publicationYearMedianTest(){

        Book bookOne =new Book("author1","title1",2000,"signature1");
        Book bookTwo =new Book("author3","title3",2006,"signature3");
        Book bookThree =new Book("author2","title2",2010,"signature2");

        Set<Book> set1 = new HashSet<Book>();
        set1.add(bookOne);
        set1.add(bookTwo);
        set1.add(bookThree);

        MedianAdapter adapter = new MedianAdapter();
        final int medianaLibrarya = adapter.publicationYearMedian(set1);

       Assert.assertEquals(2006,medianaLibrarya);


    }
}
