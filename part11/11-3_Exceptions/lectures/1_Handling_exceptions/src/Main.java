import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        readNumber(reader);
    }

    /*
    Let's make our integer parser a bit more useful.
    We'll turn it into a method which prompts the user
    for a number until they give a valid number.
    The execution stops only when the user gives a valid number.
    */
    public static int readNumber(Scanner reader) {
        while (true) {
            System.out.print("Give a number: ");

            try {
                int readNumber = Integer.parseInt(reader.nextLine());
                return readNumber;
            } catch (Exception e) {
                System.out.println("User input is not a number.");
            }
        }
    }
}
