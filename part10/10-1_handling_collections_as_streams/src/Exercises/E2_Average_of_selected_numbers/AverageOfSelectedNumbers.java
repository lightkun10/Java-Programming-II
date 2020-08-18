package Exercises.E2_Average_of_selected_numbers;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Store sequence of input in a list/collection
        List<String> inputs = new ArrayList<>();

        // Reading inputs from user
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            // Store each raw input in a variable
            String row = scanner.nextLine();
            // If input is "end", stop
            if (row.equals("end")) {
                break;
            }

            // Add input to the list/collection
            inputs.add(row);
        }

        // Ask user if they should:
        // n -> print negative numbers
        // p -> print positive numbers
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();

        if (choice.equals("p")) {
            double result = 0.00;
            result = inputs.stream()
                    .mapToInt(n -> Integer.valueOf(n))
                    .filter(n -> n >= 0)
                    .average()
                    .getAsDouble();

            System.out.println("Average of the positive numbers: " + result);
        }
        else if (choice.equals("n")) {
            double result = 0.00;
            result = inputs.stream()
                    .mapToInt(n -> Integer.valueOf(n))
                    .filter(n -> n < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + result);
        }
    }
}

