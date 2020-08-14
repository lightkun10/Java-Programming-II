package Lectures.L7_Abstract_classes;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    // Instance Variables
    private Scanner scanner;
    private ArrayList<Operation> operations;

    // Constructor
    public UserInterface(Scanner inS) {
        this.scanner = inS;
        this.operations = new ArrayList<>();
    }

    // Adding operation to operation list
    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    public void start() {
        while (true) {
            printOperations();
            System.out.print("Choice: ");

            String choice = this.scanner.nextLine();
            if (choice.equals("0")) {
                break;
            }

            executeOperation(choice);
            System.out.println();
        }
    }

    // Print list of operation available
    private void printOperations() {
        System.out.println("Operations: \n\t0: Stop");
        int i = 0;
        while (i < this.operations.size()) {
            String opName = this.operations.get(i).getName();
            System.out.println("\t" + (i + 1) + ": " + opName);
            i++;
        }
    }

    private void executeOperation(String choice) {
        int operation = Integer.parseInt(choice);

        Operation chosen = this.operations.get(operation - 1);
        chosen.execute(scanner);
    }

}
