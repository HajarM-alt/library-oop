package org.ies.library;

import org.ies.library.components.AuthorReader;
import org.ies.library.components.BookReader;
import org.ies.library.components.LibraryReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var authorReader = new AuthorReader(scanner);
        var bookReader = new BookReader(scanner, authorReader);
        var libraryReader = new LibraryReader(scanner, bookReader);

        var library = libraryReader.read();

        System.out.println(library);

    }
}