package library;

import library.ui.UserInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);

        /*
        If a class is in a different package, the method printTitle
        cannot be called. In the example below, the class Main is in
        the package library. As the printTitle method is in
        the package library.ui and has the package access modifier, it cannot be used.
        */
        // ui.printTitle(); // doesn't work!
    }
}
