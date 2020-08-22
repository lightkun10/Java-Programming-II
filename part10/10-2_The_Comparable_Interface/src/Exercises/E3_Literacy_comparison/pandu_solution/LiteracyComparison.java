package Exercises.E3_Literacy_comparison.pandu_solution;


import Exercises.E3_Literacy_comparison.pandu_solution.Literacy;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        // Read file that user input its name with
        String path = "src/Exercises/E3_Literacy_comparison/";
        String file = path + "literacy.csv";

        // All raw data as String from file read
        ArrayList<String> dataFiles = literacies(file);

        // Store String data to a List of Literacy object
        ArrayList<Literacy> literacyF = new ArrayList<>();

        // Split each String row from dataFiles
        for (String string : dataFiles) {
            String[] parts = string.split(",");
            String[] partTwo = parts[2].trim().split(" ");

            String country = parts[3];
            String gender = partTwo[0];
            int year = Integer.parseInt(parts[4]);
            double lp = Double.parseDouble(parts[5]);

            literacyF.add(new Literacy(country, gender, year, lp));
        }

        literacyF.stream().sorted().forEach(l -> System.out.println(l));
    }

    // Add read file to a List of String
    public static ArrayList<String> literacies(String file) {
        ArrayList<String> literacies = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    .forEach(row -> literacies.add(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return literacies;
    }
}
