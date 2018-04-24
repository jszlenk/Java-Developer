package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> bookMap = bookSet.stream()
                .collect(Collectors.toMap(o -> new BookSignature(o.getSignature()),
                        o -> new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                                o.getAuthor(),
                                o.getTitle(),
                                o.getPublicationYear()
                        )));
        return medianPublicationYear(bookMap);
    }
}
