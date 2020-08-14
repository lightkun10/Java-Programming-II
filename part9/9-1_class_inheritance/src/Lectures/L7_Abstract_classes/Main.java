package Lectures.L7_Abstract_classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface(new Scanner(System.in));
        ui.addOperation(new PlusOperation());
        ui.addOperation(new MinusOperation());

        ui.start();
    }
}
