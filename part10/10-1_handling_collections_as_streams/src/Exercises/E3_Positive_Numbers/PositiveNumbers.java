package Exercises.E3_Positive_Numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Store input
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end") || row.equals("quit")) { break; }

            numbers.add(Integer.parseInt(row));
        }

        System.out.println(positive(numbers));
    }

    public static List<Integer> positive(List<Integer> numbers)
    {
        List<Integer> values = numbers.stream()
                .filter(v -> v >= 0)
                .collect(Collectors.toList());

        return values;
    }

}
