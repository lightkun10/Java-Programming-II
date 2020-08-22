package Lectures.L7_Files_and_Streams;

import org.w3c.dom.ls.LSOutput;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> presidents = new ArrayList<>();

        String path = "src/Lectures/L7_Files_and_Streams/";

        try {
            // reading the "presidents.txt" file line by line
            Files.lines(Paths.get(path + "presidents.txt"))
                    // splitting the row into parts on the ";" character
                    .map(row -> row.split("; "))
                    // deleting the split rows that have less than two parts
                    // (we want the rows to always contain both the name and the birth year)
                    .filter(parts -> parts.length >= 2)
                    // creating persons from each parts
                    // part 1 as person's name, part 2 as person's birth year
                    .map(parts -> new Person(parts[0], Integer.parseInt(parts[1])))
                    // finally, add the persons to the list
                    .forEach(person -> presidents.add(person));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // now the presidents are on the list as person objects

        presidents.stream()
                .forEach(president -> System.out.println(president));
    }
}
