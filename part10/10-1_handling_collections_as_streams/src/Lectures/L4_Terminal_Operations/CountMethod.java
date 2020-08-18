package Lectures.L4_Terminal_Operations;

import java.util.ArrayList;
import java.util.List;

public class CountMethod {
    public static void run() {
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(-17);
        values.add(-6);
        values.add(8);

        // The count method informs us of the number
        // of values in the stream as a long-type variable.

        run(values);
    }

    public static void run(List<Integer> values) {

        System.out.println("Values: " + values.stream().count());
    }
}
