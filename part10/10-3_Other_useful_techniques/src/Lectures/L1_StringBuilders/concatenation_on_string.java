package Lectures.L1_StringBuilders;

public class concatenation_on_string {
    public static void main(String[] args) {
        String numbers = ""; // creating a new string: ""
        int i = 1;
        numbers = numbers + i; // creating a new string: "1"
        i++;
        numbers = numbers + i; // creating a new string: "12"
        i++;
        numbers = numbers + i; // creating a new string: "123"
        i++;
        numbers = numbers + i; // creating a new string: "1234"
        i++;

        System.out.println(numbers); // printing the string

        /*
        In the example above, five strings are created in total.

        String creation - although unnoticeable at a small scale - is not
        a quick operation. Space is allocated in memory for each string
        where the string is then placed. If the string is only needed as
        part of creating a larger string, performance should be improved.
        */
    }
}
