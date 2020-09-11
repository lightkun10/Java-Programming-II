
import java.util.Random;

public class Raffle {
    public static void main(String[] args) {
        // create Random object ladyLuck
        Random ladyLuck = new Random();

        for (int i = 0; i < 10; i++) {
            // Draw and print a random number
            int randomNumber = ladyLuck.nextInt(10); // 0, 1, 2,... 9 (not including 10)

            // Returns a random number between [0, integer] or 0..(integer -1).
            System.out.println(randomNumber);
        }

        Random weatherMan = new Random();

        // Number between [-30,50]
        // We can do this by first creating random a number
        // between 0 and 80 and then subtracting 30 from it.
        int temperature = weatherMan.nextInt(81) - 30;
        System.out.println(temperature);
    }
}

// [1, 40]
// i2 + i1;