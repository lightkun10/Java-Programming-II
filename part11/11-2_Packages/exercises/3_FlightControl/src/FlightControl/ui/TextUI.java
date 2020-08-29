package FlightControl.ui;

import FlightControl.domain.Airplane;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

public class TextUI {

    private FlightControl flightControl;
    private Scanner scanner;

    public TextUI(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    public void start() {
        startAssertControl();
        System.out.println();
        startFlightControl();
        // this.flightControl.getFlights().stream().forEach(f -> System.out.println(f));
    }

    private void startAssertControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        // Keep asking user for action command
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String action = this.scanner.nextLine();

            if (action.equals("1")) {
                addAirplane();
            } else if (action.equals("2")) {
                addFlight();
            } else if (action.equals("x")) {
                break;
            }
        }
    }

    private void addAirplane() {
        System.out.print("Give the airplane id: ");
        String id = this.scanner.nextLine();
        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.parseInt(this.scanner.nextLine());

        this.flightControl.addAirplane(id, capacity);
    }

    private void addFlight() {
        System.out.print("Give the airplane id: ");
        Airplane plane = askAirplane();
        System.out.print("Give the departure airport id: ");
        String origin = scanner.nextLine();
        System.out.print("Give the target airport id: ");
        String destination = scanner.nextLine();

        this.flightControl.addFlight(plane, origin, destination);
    }

    private void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();

        // Keep asking user for action command
        while (true) {
//            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String action = this.scanner.nextLine();

            if (action.equals("1")) {
                printAirplanes();
            } else if (action.equals("2")) {
                printFlights();
            } else if (action.equals("3")) {
                printAirplaneDetails();
            } else if (action.equals("x")) {
                break;
            }
        }
    }

    private void printAirplanes() {
        flightControl.getAirplanes()
                .stream()
                .forEach(airplane -> System.out.println(airplane));
    }

    private void printFlights() {
        flightControl.getFlights()
                .stream()
                .forEach(flight -> System.out.println(flight));
    }

    private void printAirplaneDetails() {
        System.out.print("Give the airplane id: ");
        Airplane plane = askAirplane();
        System.out.println(plane);
        System.out.println();
    }

    private Airplane askAirplane() {
        Airplane a = null;
        while (a == null) {
            String id = scanner.nextLine();
            a = this.flightControl.getAirplane(id);

            if (a == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
        }

        return a;
    }
}