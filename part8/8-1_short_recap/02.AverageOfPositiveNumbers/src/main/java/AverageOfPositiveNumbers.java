
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int div = 0;

        while (true) {
            double num = Double.parseDouble(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0) {
                div++;
                sum = sum + num;
            }
        }

        if (div != 0) {
            System.out.println(sum / div);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
