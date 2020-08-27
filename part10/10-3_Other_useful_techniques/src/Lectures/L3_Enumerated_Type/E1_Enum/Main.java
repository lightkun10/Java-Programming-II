package Lectures.L3_Enumerated_Type.E1_Enum;

import Lectures.L3_Enumerated_Type.E1_Enum.Card;
import Lectures.L3_Enumerated_Type.E1_Enum.Suit;

public class Main {
    public static void main(String[] args) {
        Card first = new Card(10, Suit.HEART);

        System.out.println(first);

        /*
        Each enum field gets a unique number code, and they can be compared using
        the equals sign. Just as other classes in Java, these values also inherit
        the Object class and its equals method. The equals method compares this
        numeric identifier in enum types too.
        The numeric identifier of an enum field value can be found with ordinal().
        */
        System.out.println(Suit.DIAMOND.ordinal());
        System.out.println(Suit.SPADE.ordinal());

        if (first.getSuit() == Suit.SPADE) {
            System.out.println(first + " is a spade");
        } else {
            System.out.println(first + " is not a spade, sadly.");
        }

    }
}
