package Exercises.E4_Literature.pandu_attempt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        // Keep asking for user input
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");

            String iName = scanner.nextLine();
            if (iName.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int iAge = Integer.parseInt(scanner.nextLine());
            System.out.println("");

            books.add(new Book(iName, iAge));
        }

        // Sorts the books with the same age recommendation
        // based on their name alphabetically.
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getName);
        Collections.sort(books, comparator);

        System.out.println("\n" + books.size() + " books in total.");
        System.out.println("\nBooks:");
        books.stream().forEach(b -> System.out.println(b));
    }

}
