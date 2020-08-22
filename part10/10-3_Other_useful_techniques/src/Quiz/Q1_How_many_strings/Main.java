package Quiz.Q1_How_many_strings;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("first"); // 1
        words.add("second"); // 2
        words.add("third"); // 3

        String connectedString = ""; // 4
        for (int i = 0; i < words.size(); i++) {
            connectedString = connectedString + words.get(i); // 5, 6, 7
        }

        /*
        Question: How many strings does the following program create?

        Answer:   This operation create 7 strings.
        */
    }
}
