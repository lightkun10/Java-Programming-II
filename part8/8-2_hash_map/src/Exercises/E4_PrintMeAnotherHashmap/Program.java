package Exercises.E4_PrintMeAnotherHashmap;

import java.util.Collection;
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    /* Class methods */

    // Prints all the values in the hashmap given as a parameter
    // using the toString method of the Book objects.
    public static void printValues(HashMap<String, Book> hashmap) {
        // Store Book class, that is the value, in a Collection
        // https://www.javatpoint.com/collections-in-java
        Collection<Book> books = hashmap.values();

        // Using lambda, print each book in books stored in Collection
        books.forEach(System.out::println);

    }

    // prints only the Books in the given hashmap which name contains
    // the given string. You can find out the name of a Book with the
    // method getName.
    public static void printValueIfNameContains(HashMap<String, Book>hashmap, String text) {
        Collection<Book> books = hashmap.values();

        // Using lambda, if book's name stored in Collection
        // is the same as parameter, print Book's full info
        books.forEach(book -> {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        });
    }

}
