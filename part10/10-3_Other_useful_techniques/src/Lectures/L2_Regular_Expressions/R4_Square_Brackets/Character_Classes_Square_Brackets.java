package Lectures.L2_Regular_Expressions.R4_Square_Brackets;

public class Character_Classes_Square_Brackets {
    public static void main(String[] args) {
        /*
        A character class can be used to specify a set of
        characters in a compact way.
        Characters are enclosed in square brackets, and a
        range is indicated with a dash.
        For example, [145] means (1|4|5) and [2-36-9] means (2|3|6|7|8|9).
        Similarly, the entry [a-c]* defines a regular expression
        that requires the string to contain only a, b and c.
        */
        String string = "queo";

        // Only match a, e, i, o, u
        if (string.matches("[aeiou]*")) {     //  Same as "(a|e|i|o|u)*"
            System.out.println("Match!");
        } else {
            System.out.println("Not match.");
        }
    }
}
