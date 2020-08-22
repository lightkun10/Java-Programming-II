package Lectures.L2_Regular_Expressions.R2_Parentheses;

public class Affecting_Part_of_String {
    public static void main(String[] args) {
        /* =================================================
            Affecting Part of a String (Parentheses)
           =================================================
           You can use parentheses "()" to determine which part of a
           regular expression is affected by the rules inside
           the parentheses. Say we want to allow the strings
           00000 and 00001. We can do that by placing a vertical
           bar in between them this way 00000|00001.
           Parentheses allow us to limit the option to a specific
           part of the string. The expression 0000(0|1) specifies the strings 00000 and 00001.
         */
        String string = "cars";

        /*
        Similarly, the regular expression car(|s|) defines the
        singular (car) and plural (cars) forms of the word car.
        */
        if (string.matches("car(|s|)")) {
            System.out.println("The string contained one of the three alternatives");
        } else {
            System.out.println("The string contained none of the alternatives");
        }

        string = "successfully";

        if (string.matches("success(|fully|)")) {
            System.out.println("The string contained one of the three alternatives");
        } else {
            System.out.println("The string contained none of the alternatives");
        }
    }
}
