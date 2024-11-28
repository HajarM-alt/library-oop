package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    private String name;
    private Book[] books;

    public Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }
    public boolean hasBook(String isbn) {
        for (var book : books) {
            if (book.getIsbn().equals(isbn))
                return true;
        }
        return false;
    }

    public boolean hasAuthor(String authorNif) {
        for (var book : books) {
            if (book.hasAuthor(authorNif)) {
                return true;
            }
        }
        return false;
    }

    public int countBooks(String authorNif) {
        int count = 0;
        for (var book : books) {
            if (book.hasAuthor(authorNif))
                count++;
        }
        return count;
    }

    public int countYearBooks(int year) {
        int count = 0;
        for (var book : books) {
            if (book.getYear() == year) {
                count++;
            }
        }
        return count;
    }

    public Book findBook(String isbn) {
        for (var book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) && Objects.deepEquals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(books));
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}