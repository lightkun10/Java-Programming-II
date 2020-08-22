package Exercises.E10_Books_from_file;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book file to read:");
        String file = scanner.nextLine();

        // readBooks(file);
        readBooks(file).stream()
                .forEach(book -> System.out.println(book));
    }

    // Read the file given as the parameter and forms book data from it.
    public static List<Book> readBooks(String file) {
        // Add file read to this List
        List<Book> books = new ArrayList<>();
        String fullPath = "src/Exercises/E10_Books_from_file/" + file;

        try {
            Files.lines(Paths.get(fullPath))
                    // Split each rows into parts on the "," character
                    .map(row -> row.split(","))
                    // deleting the split rows that have less than four parts
                    // (to take name, publishingyear, pagecount, author)
                    .filter(parts -> parts.length >= 4)
                    // create new instance of book from each part
                    .map(parts -> new Book(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), parts[3]))
                    // add each newly created book to list of book
                    .forEach(book -> books.add(book));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return books;
    }
}