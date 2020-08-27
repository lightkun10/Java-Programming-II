package Exercises.E3_Sort_them_cards.pandu_solution;

import java.util.Comparator;

public class SortBySuit implements Comparator<Card> {

    /*
    clubs first, diamonds second, hearts third, spades last.
    */
    public int compare(Card c1, Card c2) {
//        System.out.println(c1.getSuit().ordinal() + c1.getSuit().name() + " --- " + c2.getSuit().ordinal() + c2.getSuit().name()
//                + " => " + (c1.getSuit().ordinal() - c2.getSuit().ordinal()));
        return c1.getSuit().ordinal() - c2.getSuit().ordinal();
    }
}
