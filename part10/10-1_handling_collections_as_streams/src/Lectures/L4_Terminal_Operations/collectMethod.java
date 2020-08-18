package Lectures.L4_Terminal_Operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class collectMethod {
    public static void run() {
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(-17);
        values.add(-6);
        values.add(8);

        // You can use the collect method to collect stream values
        // into another collection. The example below creates a new
        // list containing only positive values. The collect method
        // is given as a parameter to the Collectors object to which
        // the stream values ​​are collected - for example, calling
        // Collectors.toCollection(ArrayList::new) creates a new
        // ArrayList object that holds the collected values.
        ArrayList<Integer> positives = values.stream()
                .filter(val -> val > 0)
                .collect(Collectors.toCollection(ArrayList::new));

        run(positives);
    }

    public static void run(ArrayList<Integer> numbers) {
        numbers.stream()
                .forEach(val -> System.out.println(val));
    }

}
