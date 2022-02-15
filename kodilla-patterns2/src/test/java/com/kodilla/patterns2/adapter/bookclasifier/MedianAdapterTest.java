package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookInformation;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MedianAdapterTest {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter adapter = new MedianAdapter();
        Set<BookInformation> books = new HashSet<>();
        BookInformation first = new BookInformation("Antoine’a de Saint-Exupéry’ego",
                                                     "Mały Książę",
                                            1943,
                                                 "1");
        BookInformation second = new BookInformation("James Fenimore Cooper",
                                                      "Ostatni Mohikanin",
                                             1826,
                                                    "2");
        BookInformation third = new BookInformation("Arkadego Fiedlera",
                                                    "Dywizjon 303",
                                                    1942,
                                                    "3");
        books.add(first);
        books.add(second);
        books.add(third);
        //When
        int median = adapter.publicationYearMedian(books);
        //Then
        assertEquals(1942, median);
    }

}