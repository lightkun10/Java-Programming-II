package Exercises.E6_Limited_numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // List for storing all input from user
        ArrayList<Integer> inputs = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();

            if (Integer.parseInt(row) < 0) {
                break;
            }

            inputs.add(Integer.parseInt(row));
        }

        inputs.stream()
                .filter(n -> n >= 1 && n <= 5)
                .forEach(n -> System.out.println(n));
    }
}
