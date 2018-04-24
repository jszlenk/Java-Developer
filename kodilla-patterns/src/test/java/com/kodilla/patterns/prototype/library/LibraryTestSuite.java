package com.kodilla.patterns.prototype.library;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        Library library = new Library("Library 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Title number" + n, "Author" + n, LocalDate.now())));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.err.println("failed to shallow clone: " + e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.err.println("failed to deep clone: " + e);
        }

        //When
        Book kay = new Book("Title number1", "Author1", LocalDate.now());
        library.getBooks().remove(kay);

        //Then
        System.out.println(library.getBooks());
        System.out.println(clonedLibrary != null ? clonedLibrary.getBooks() : null);
        System.out.println(deepClonedLibrary != null ? deepClonedLibrary.getBooks() : null);

        Assert.assertEquals(9, library.getBooks().size());
        assert clonedLibrary != null;
        Assert.assertEquals(9, clonedLibrary.getBooks().size());
        assert deepClonedLibrary != null;
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
