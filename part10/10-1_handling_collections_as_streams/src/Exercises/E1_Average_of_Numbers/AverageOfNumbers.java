package Exercises.E1_Average_of_Numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Store sequence of input in a list/collection
        List<String> inputs = new ArrayList<>();

        // Reading inputs from user
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            // Store each raw input in a variable
            String row = scanner.nextLine();
            // Stop asking from user if user type "end"
            if (row.equals("end")) {
                break;
            }

            // Add input to the collection/list
            inputs.add(row);
        }

        // Calculate the average of all of the numbers
        double average = inputs.stream()
                .mapToInt(n -> Integer.parseInt(n))
                .average()
                .getAsDouble();

        System.out.println("average of the numbers: " + average);
    }
}
