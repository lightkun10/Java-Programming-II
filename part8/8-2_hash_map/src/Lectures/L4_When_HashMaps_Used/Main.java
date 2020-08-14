package Lectures.L4_When_HashMaps_Used;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Book> directory = new HashMap<>();

        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");
        directory.put(senseAndSensibility.getName(), senseAndSensibility);
        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);

        // adding ten million books to the list

        long start = System.nanoTime();
        System.out.println(directory.get("Sense and Sensibility"));

        System.out.println();

        System.out.println(directory.get("Persuasion"));
        long end = System.nanoTime();
        double durationInMilliseconds = 1.0 * (end - start) / 1000000;

        System.out.println("The book search took " + durationInMilliseconds + " milliseconds.");
    }

}
