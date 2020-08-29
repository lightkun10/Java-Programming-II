package library.ui;

import java.util.Scanner;
import library.ui.UserInterface;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);

        ui.printTitle(); // works!
    }
}
