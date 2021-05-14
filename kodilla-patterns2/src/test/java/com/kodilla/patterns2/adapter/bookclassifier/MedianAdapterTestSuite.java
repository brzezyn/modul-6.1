package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianAdapterTest(){
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("Author_1", "Book_1", 2012, "z2d1"));
        books.add(new Book("Author_2", "Book_2", 2015, "e4t2"));
        books.add(new Book("Author_3", "Book_3", 1997, "o9t1"));
        books.add(new Book("Author_4", "Book_4", 2019, "aOp3"));

        //When
        double median = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(2015, median, 0);

    }
}