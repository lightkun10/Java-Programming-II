package Lectures.L4_Terminal_Operations;

import java.util.ArrayList;

public class reduceMethod {
    public static void run() {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(7);
        values.add(3);
        values.add(2);
        values.add(1);

        // The reduce method is useful when you want to combine stream
        // elements to some other form. The parameters accepted by the
        // method have the following format:
        // reduce(*initialState*, (*previous*, *object*) -> *actions on the object*).
        int sum = values.stream()
                .reduce(0, (previousSum, value) -> previousSum + value);

        run(sum);
    }

    public static void run(int numbers) {
        System.out.println(numbers);
    }

}
