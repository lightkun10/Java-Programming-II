package Lectures.L2_Regular_Expressions.R3_Quantifiers;

public class Quantifiers {
    public static void main(String[] args) {
        /* =================================================
            Quantifiers
           =================================================
            What is often desired is that a particular sub-string is
            repeated in a string. The following expressions are
            available in regular expressions:
        */

        // The quantifier "*" repeats 0 ... times:
        String string = "trolololololo";

        if (string.matches("trolo(lo)*")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        // The quantifier "+" repeats 1 ... times:
        string = "trolololololo";
        if (string.matches("tro(lo)+")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        string = "nananananananana Batmaan!";

        if (string.matches("(na)+ Batmaan!")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        // The qualifier "?" repeats 0 or 1 times:
        string = "You have to accidentally the whole meme";

        if (string.matches("You have to accidentally (delete )?the whole meme")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        // The quantifier {a} repeats a times:
        string = "1010";

        if (string.matches("(10){2}")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        // The quantifier {a,b} repeats a ... b times:
        // a min, b max
        string = "11";

        if (string.matches("1{2,4}")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        // The quantifier {a,} repeats a ... times:
        string = "11111";

        if (string.matches("1{2,}")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        /* More than one quantifiers
        For example, define strings that begin and end with three fives.
        An unlimited number of ones and zeros are allowed in between.
        */
        String nString = "555010001001110555";

        if (nString.matches("5{3}(0|1)*5{3}")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

    }
}
