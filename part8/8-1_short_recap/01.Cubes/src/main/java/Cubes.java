
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            // If user input "end", end the loop
            if (input.equals("end")) {
                break;
            }

            // Turn user input into integer
            int num = Integer.parseInt(input);
            int cube = num * num * num;
            System.out.println(cube);
        }
    }
}
