package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() throws Exception {

        //GIVEN
        Library library = new Library("School library");
        Book book1 = new Book("Book No.04", "Author #1", LocalDate.of(1995, 11, 22));
        Book book2 = new Book("Book No.03", "Author #2", LocalDate.of(1990, 12, 2));
        Book book3 = new Book("Book No.02", "Author #3", LocalDate.of(1997, 10, 25));
        Book book4 = new Book("Book No.01", "Author #4", LocalDate.of(1998, 9, 12));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book4);
        library.getBooks().add(book3);

        //making a shallow copy of object board
        Library clonedLibrary = null;
        try {
        clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("National library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
        deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("Public library");
        } catch (CloneNotSupportedException e) {
        System.out.println(e);
        }

        //WHEN
        library.getBooks().remove(book1);
        //THEN
        Assertions.assertEquals(3, library.getBooks().size());
        Assertions.assertEquals(3, clonedLibrary.getBooks().size());
        Assertions.assertEquals(4, deepClonedLibrary.getBooks().size());

    }
}