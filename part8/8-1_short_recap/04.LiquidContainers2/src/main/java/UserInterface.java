import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Container container1;
    private Container container2;

    public UserInterface(Scanner s, Container c1, Container c2) {
        this.scanner = s;
        this.container1 = c1;
        this.container2 = c2;
    }

    public void start() {
        while (true) {
            // Stats print
            System.out.println("First: " + this.container1);
            System.out.println("Second: " + this.container2);
            String input = scanner.nextLine();
            System.out.println("");

            // If user input "quit", exit the program
            if (input.equals("quit")) {
                break;
            }

            // === Split user input===
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            // If user input "add", adds the amount of liquid
            // specified by the parameter to the first container.
            // The inserted amount must be specified as an integer.
            // The container can't hold more than a hundred liters
            // and everything added past that will go to waste
            if (command.equals("add")) {
                this.container1.add(amount);
            }

            // If user input "move", move liquid from the first
            // container to the second
            if (command.equals("move")) {
                if (this.container1.contains() != 0) {
                    this.container1.remove(amount);
                    this.container2.add(this.container1.moveContainer());
                }
            }

            // If user input "remove", remove liquid from the second container
            if (command.equals("remove")) {
                this.container2.remove(amount);
            }

        }
    }

}
