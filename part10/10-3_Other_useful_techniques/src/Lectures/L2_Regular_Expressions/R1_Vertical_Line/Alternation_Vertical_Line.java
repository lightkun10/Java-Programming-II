package Lectures.L2_Regular_Expressions.R1_Vertical_Line;

public class Alternation_Vertical_Line {
    public static void main(String[] args) {
        /* ===============================
            Alternation (Vertical Line)
         ================================
           A vertical line indicates that parts of a regular expressions
           are optional. For example, 00|111|0000 defines the strings
           00, 111 and 0000. The respond method returns true if the string
           matches any one of the specified group of alternatives.
         */
        String string = "000";

        if (string.matches("00|111|000")) {
            System.out.println("The string contained one of the three alternatives");
        } else {
            System.out.println("The string contained none of the alternatives");
        }


        /*
        The regular expression 00|111|0000 demands that the string
        is exactly it specifies it to be - there is no "contains" functionality.
        */

        string = "1111";

        if (string.matches("00|111|000")) {
            System.out.println("The string contained one of the three alternatives");
        } else {
            System.out.println("The string contained none of the alternatives");
        }

        string = "abc";

        if (string.matches("mon|tue|wed|thu|fri|sat|sun")){
            System.out.println("The string contained one of the three alternatives");
        } else {
            System.out.println("The string contained none of the alternatives");
        }



    }
}
