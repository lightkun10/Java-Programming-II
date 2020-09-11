import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();

        /** Draw 7 numbers */
        for (int i = 0; i < 7; i++) {
            // The numbers are in range 1—40
            Random rnd = new Random();
            int rndNum = rnd.nextInt(40) + 1;

            // If random number not added, add to list
            if (!containsNumber(rndNum)) {
                this.numbers.add(rndNum);
                // Otherwise, draw again
            } else {
                i--;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        for (Integer n : this.numbers) {
            if (n == number) {
                return true;
            }
        }

        return false;
    }
}