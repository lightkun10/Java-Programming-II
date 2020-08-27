package Exercises.E3_Sort_them_cards.pandu_solution;

import java.util.Collections;
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    public int compare(Card c1, Card c2) {
        // If card1 and card2's suit are the same,
        // order them by their value, ascending.
        if (c1.getSuit().ordinal() == c2.getSuit().ordinal()) {
            return c1.getValue() - c2.getValue();
        }
        // Else if card1 and card2's suit are different,
        // order them by this order:
        // clubs first, diamonds second, hearts third, spades last.
        else {
            SortBySuit sb = new SortBySuit();
            return sb.compare(c1, c2);
        }
    }
}