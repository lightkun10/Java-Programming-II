package Lectures.L7_Abstract_classes;

import java.util.Scanner;

public class MinusOperation extends Operation {

    public MinusOperation() {
        super("Minus Operation", "An operation of subtracting two numbers");
    }

    @Override
    public void execute(Scanner scanner) {
        System.out.print("First number: ");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.print("Second number: ");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Result of subtracting numbers are " + (first - second));
    }

}
