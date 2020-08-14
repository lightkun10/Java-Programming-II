package Lectures.L2_Approximate_Comparison_With_HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // The key is the book and the value is a string that tells the borrower's name
        HashMap<Book, String> borrowers = new HashMap<>();

        Book bookObject = new Book("Book Object", 2000, "...");
        borrowers.put(bookObject, "Pekka");
        borrowers.put(new Book("Test Driven Development", 1999, "..."), "Arto");

        System.out.println(borrowers.get(bookObject));
        System.out.println(borrowers.get(new Book("Book Object", 2000, "...")));
        /* Exact same books but different object, therefore borrower isn't found. */

        System.out.println(borrowers.get(new Book("Test Driven Development", 1999, "...")));
    }
}
