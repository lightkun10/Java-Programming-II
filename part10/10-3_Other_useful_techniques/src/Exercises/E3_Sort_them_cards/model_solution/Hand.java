package Exercises.E3_Sort_them_cards.model_solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(cards);
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }

    private int sumOfValues() {
        int sum = 0;

        for (Card card : cards) {
            sum += card.getValue();
        }

        return sum;
    }

    @Override
    public int compareTo(Hand hand) {
        return this.sumOfValues() - hand.sumOfValues();
    }

}
