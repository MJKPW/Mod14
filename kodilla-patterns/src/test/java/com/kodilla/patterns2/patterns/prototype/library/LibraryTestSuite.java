package com.kodilla.patterns2.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        String test = "123";
        Library library = new Library("first");
        Book first = new Book("Ostatni Mohikanin", "James Fenimore Cooper", LocalDate.of(1826, 2, 11));
        Book second = new Book("Mały Książę", "Antoine de Saint-Exupéry", LocalDate.of(1943, 4, 6));
        Book third = new Book("Marsjanin", "Andy Weira", LocalDate.of(2014, 11, 19));
        //When
        library.getBooks().add(first);
        library.getBooks().add(second);
        Library libraryShallowCopy, libraryDeepCopy;
        libraryShallowCopy = libraryDeepCopy = null;
        try {
            libraryShallowCopy = library.shallowCopy();
            libraryDeepCopy = library.deepCopy();
            libraryShallowCopy.getBooks().add(third);
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //Then
        Assertions.assertEquals(3, library.getBooks().size());
        Assertions.assertEquals(3, libraryShallowCopy.getBooks().size());
        Assertions.assertEquals(2, libraryDeepCopy.getBooks().size());
    }
}
