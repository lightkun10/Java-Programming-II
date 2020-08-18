package Lectures.L1_Intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 Write a program that reads input from a user and
 prints statistics about those inputs. When the
 user enters the string "end", the reading is stopped.
 Other inputs are numbers in string format. When you
 reading inputs, the program prints the number of
 positive integers divisible by three, and the average of all values.
*/

public class Main {
    public static void main(String[] args) {
        // We initialise the scanner and the list into which the input is read
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        // Reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            inputs.add(row);
        }

        // Counting the number of values divisible by three
        long numberDivisibleByThree = inputs.stream()
                                            .mapToInt(s -> Integer.valueOf(s))
                                            .filter(number -> number % 3 == 0)
                                            .count();
        /*
        A stream can be formed from any object that implements the Collection
        interface (e.g., ArrayList, HashSet, HashMap, ...) with the stream()
        method. The string values ​​are then converted ("mapped") to integer
        form using the stream's mapToInt(value -> conversion) method.
        The conversion is implemented by the valueOf method of the Integer class,
        which we've used in the past. We then use the filter
        (value -> filter condition) method to filter out only those numbers that
        are divisible by three for further processing. Finally, we call the
        stream's count() method, which counts the number of elements in the stream
        and returns it as a long type variable.
        */

        // working out the average
        double average = inputs.stream()
                               .mapToInt(s -> Integer.valueOf(s))
                               .average()
                               .getAsDouble();
        /*
        Calculating the average is possible from a stream that has the mapToInt
        method called on it. A stream of integers has an average method that
        returns an OptionalDouble-type object. The object has getAsDouble() method
        that returns the average of the list values as a type double varaible.
        */

        // Printing out the statistics
        System.out.println("Divisible by three = " + numberDivisibleByThree);
        System.out.println("Average number: " + average);
    }
}
