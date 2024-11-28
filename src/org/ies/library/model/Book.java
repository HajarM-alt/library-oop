package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String isbn;
    private String title;
    private int year;
    private Author[] authors;

    public Book(String isbn, String title, int year, Author[] authors) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.authors = authors;
    }


    public boolean hasAuthor(String authorNif) {
        for (var author : authors) {
            if (author.getNif().equals(authorNif)) {
                return true;
            }
        }
        return false;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title) && Objects.deepEquals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, year, Arrays.hashCode(authors));
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }

}