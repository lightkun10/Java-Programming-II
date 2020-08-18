package Exercises.E5_Printing_User_Input;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // List for storing all input from user
        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();

            if (row.isEmpty()) {
                break;
            }

            inputs.add(row);
        }

        inputs.stream()
                .forEach(s -> System.out.println(s));
    }
}
