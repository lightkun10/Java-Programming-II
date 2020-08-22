package Quiz.Q2_How_many_strings_this_time;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("first"); // 1
        words.add("second"); // 2
        words.add("third"); // 3

        StringBuilder connectedString = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            connectedString.append(words.get(i)); // 4
        }

        System.out.println(connectedString.toString());

        /*
        Question: How many strings does the following program create?

        Answer:   This operation create 4 strings.
        */
    }
}
