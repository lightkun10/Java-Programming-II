package Lectures.L5_Hash_Map_as_Instance_Variable;

import java.util.HashMap;

public class Library {
    private HashMap<String, Book> directory;

    public Library() {
        this.directory = new HashMap<>();
    }

    public void addBook(Book book) {
        // Get the name of the sanitized book data
        String name = sanitizedString(book.getName());

        if (this.directory.containsKey(name)) {
            System.out.println("Book is already in the library!");
        } else {
            directory.put(name, book);
            // System.out.println("Book successfully added");
        }
    }

    public Book getBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);
        return this.directory.get(bookTitle);
    }

    public void removeBook(String bookTitle) {
        bookTitle = sanitizedString(bookTitle);

        if (this.directory.containsKey(bookTitle)) {
            this.directory.remove(bookTitle);
        } else {
            System.out.println("Book was not found, no book removed.");
        }
    }

    // The method is implemented as a class method
    // since it doesn't handle object variables.
    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        /*
        allow for minor misspellings, such as
        capitalized or lower-cased strings, or ones
        with spaces at the beginning and/or end
         */
        string = string.toLowerCase();
        return string.trim();
    }

}
