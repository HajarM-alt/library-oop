package org.ies.library.components;

import org.ies.library.model.Book;
import org.ies.library.model.Library;

import java.util.Scanner;

public class LibraryReader {
    private final Scanner scanner;
    private final BookReader bookReader;

    public LibraryReader(Scanner scanner, BookReader bookReader) {
        this.scanner = scanner;
        this.bookReader = bookReader;
    }

    public Library read() {
        System.out.println("Introduce los datos de la biblioteca");
        System.out.println("Nombre:");
        String name = scanner.nextLine();

        System.out.println("Cuantos libros tiene la biblioteca");
        int numBooks = scanner.nextInt();
        scanner.nextLine();

        Book[] books = new Book[numBooks];
        for (int i = 0; i < books.length; i++) {
            books[i] = bookReader.read();
        }

        return new Library(
                name,
                books
        );
    }
}