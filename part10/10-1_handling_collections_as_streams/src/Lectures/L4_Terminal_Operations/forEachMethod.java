package Lectures.L4_Terminal_Operations;

import java.util.ArrayList;
import java.util.List;

public class forEachMethod {
    public static void run() {
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(17);
        values.add(6);
        values.add(8);

        run(values);
    }

    // The forEach method defines what is done to each
    // list value and terminated the stream processing.
    // In the example below, we first create a list of numbers,
    // after which we only print the numbers that are divisible by two.
    public static void run(List<Integer> values) {
        values.stream()
                .filter(value -> value % 2 == 0)
                .forEach(value -> System.out.println(value));
    }
}
