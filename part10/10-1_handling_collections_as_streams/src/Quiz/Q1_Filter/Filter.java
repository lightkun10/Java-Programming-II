package Quiz.Q1_Filter;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        }

        long howManyNumbers = numbers.stream()
                .filter(i -> i < 4)
                .map(i -> i * 2)
                .filter(i -> i > 10)
                .count();

        System.out.println("Numbers: " + howManyNumbers);
    }
}
