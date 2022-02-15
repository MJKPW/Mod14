package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookInformation;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<BookInformation> bookSet) {
        Map<BookSignature, Book> information = new HashMap<>();
        for(BookInformation bookInfo : bookSet) {
            BookSignature signature = new BookSignature(bookInfo.getSignature());
            Book book = new Book(bookInfo.getAuthor(), bookInfo.getTitle(), bookInfo.getPublicationYear());
            information.put(signature, book);
        }
        return medianPublicationYear(information);
    }

}
