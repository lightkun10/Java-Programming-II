package library.ui;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        printTitle();

        // other functionality
    }

    /*
    If the access modifier is missing, the methods and variables are
    only visible inside the same package. We call this the default or package modifier.
    */
    void printTitle() {
        System.out.println("***********");
        System.out.println("* LIBRARY *");
        System.out.println("***********");
    }

}
