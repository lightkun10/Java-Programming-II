package Lectures.L2_Regular_Expressions;

import java.util.Scanner;

public class Regular_Expressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide a student number: ");
        String number = scanner.nextLine();

        /*
        A student number should begin with "01" followed by 7 digits between 0–9.
        ` 017365981 `
        */
//        if (number.matches("01[0-9]{7}")) {
//            System.out.println("Correct format.");
//        } else {
//            System.out.println("Incorrect format.");
//        }

        // hh:mm:ss
        // hh -> 1 .. 23;
        // mm -> 1 .. 59;
        // ss -> 1 .. 59
        if (number.matches("([0-1][0-9]|[2][0-3]):([0-5][0-9]):([0-5][0-9])")) {
            System.out.println("OK");
        }
//        if (number.matches("[0-1][0-9]|[2][0-3]:[0-5][0-9]:[0-5][0-9]")) {
//            System.out.println("OK");
//        }

    }
}
