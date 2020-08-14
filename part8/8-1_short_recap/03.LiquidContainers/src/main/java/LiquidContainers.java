
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        int limit = 100;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            String input = scan.nextLine();
            System.out.println("");

            // If user input "quit", quit the program
            if (input.equals("quit")) {
                break;
            }

            // === Split user input===
            String[] parts = input.split(" ");
            String command = parts[0];
            command = command.toLowerCase();
            int amount = Integer.parseInt(parts[1]);

            // If user input "add", adds the amount of liquid
            // specified by the parameter to the first container.
            // The inserted amount must be specified as an integer.
            // The container can't hold more than a hundred liters
            // and everything added past that will go to waste
            if (command.equals("add")) {
                if (firstContainer + amount <= limit && amount >= 0) {
                    firstContainer += amount;
                } else if (firstContainer + amount > limit && amount > 0) {
                    firstContainer = limit;
                }
            }

            // If user input "move", move liquid from the first
            // container to the second
            if (command.equals("move")) {
                // Don't allow amount is less than 0
                if (amount >= 0) {
                    if (firstContainer - amount == 0) {
                        firstContainer -= amount;

                        if (secondContainer + amount <= limit) {
                            secondContainer += amount;
                        } else {
                            secondContainer = limit;
                        }

                    }

                    else if (firstContainer - amount < 0 && firstContainer != 0) {
                        int moved = amount - firstContainer;
                        moved = amount - moved;
                        secondContainer += moved;
                        firstContainer = 0;
                    }

                    else if (firstContainer - amount > 0) {
                        if (secondContainer + amount <= limit) {
                            secondContainer += amount;
                        } else {
                            secondContainer = limit;
                        }

                        firstContainer -= amount;
                    }
                }
            }

            // If user input "remove", remove liquid from the second container
            if (command.equals("remove")) {
                if (secondContainer - amount >= 0) {
                    secondContainer -= amount;
                } else if (secondContainer - amount < 0) {
                    secondContainer = 0;
                }
            }
        }
    }

}
