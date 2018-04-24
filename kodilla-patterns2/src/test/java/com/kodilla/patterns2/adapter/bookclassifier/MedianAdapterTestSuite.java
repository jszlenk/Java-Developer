package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();

        bookSet.add(new Book("XYZ", "T", 1993, "ISBN-123-456-789"));
        bookSet.add(new Book("XYZ", "T", 1994, "ISBN-123-456-789"));
        bookSet.add(new Book("XYZ", "T", 1995, "ISBN-123-456-789"));
        bookSet.add(new Book("XYZ", "T", 1996, "ISBN-123-456-789"));
        bookSet.add(new Book("XYZ", "T", 1997, "ISBN-123-456-789"));
        bookSet.add(new Book("XYZ", "T", 1998, "ISBN-123-456-789"));
        bookSet.add(new Book("XYZ", "T", 1999, "ISBN-123-456-789"));

        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(bookSet);

        System.out.println(median);

        Assert.assertEquals(median, 1996);
    }
}
