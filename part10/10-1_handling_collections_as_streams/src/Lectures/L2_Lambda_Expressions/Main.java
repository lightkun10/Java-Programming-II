package Lectures.L2_Lambda_Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Lambda expression, is shorthand provided by Java for
anonymous methods that do not have an "owner",
i.e., they are not part of a class or an interface.
The function contains both the parameter definition
and the function body. The same function can be
written in several different ways.
*/
public class Main {
    public static void main(String[] args) {
        // initializing a scanner and a list to which values are read
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        // reading inputs
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }

        int numberOfMappedValues = 0;

        // determining the number of values divisible by three
        long numbersDivisibleByThree = inputs.stream()
                .mapToInt(s -> {
                    // variables declared outside of an anonymous function
                    // cannot be used, so code below won't work
                    // numberOfMappedValues++;;
                    return Integer.valueOf(s);
                }).filter(value -> value % 3 == 0)
                .count();

        System.out.println(numbersDivisibleByThree);
    }
}
