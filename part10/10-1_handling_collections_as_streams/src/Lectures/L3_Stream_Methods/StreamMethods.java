package Lectures.L3_Stream_Methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // 1
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(6);

        ArrayList<Integer> values = list.stream() // 2
                                        .filter(value -> value > 5) // 3
                                        .map(value -> value * 2) // 4
                                        .collect(Collectors.toCollection(ArrayList::new)); // 5

        System.out.println(values);
    }
}
