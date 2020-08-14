package Lectures.L7_Abstract_classes;

import java.util.Scanner;

public class PlusOperation extends Operation {

    public PlusOperation() {
        super("Plus Operation", "An operation of adding two numbers");
    }

    @Override
    public void execute(Scanner scanner) {
        System.out.print("First number: ");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.print("Second number: ");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of numbers is " + (first + second));
    }

}
