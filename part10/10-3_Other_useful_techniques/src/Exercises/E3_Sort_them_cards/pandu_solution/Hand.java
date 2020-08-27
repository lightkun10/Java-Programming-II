package Exercises.E3_Sort_them_cards.pandu_solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    // adds a card to the hand
    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        this.cards.stream().forEach(System.out::println);
    }

    // Sorts the cards in the hand
    public void sort() {
        Collections.sort(this.cards);
    }

    // Return sum of particular hand's total value
    public int totalValue() {
        int total = 0;

        Iterator<Card> iterator = this.cards.iterator();

        while (iterator.hasNext()) {
            total += iterator.next().getValue();
        }

        return total;
    }

    @Override
    public int compareTo(Hand oH) {
        return this.totalValue() - oH.totalValue();
    }

    public void sortBySuit() {
        SortBySuit sb = new SortBySuit();
        BySuitInValueOrder bs = new BySuitInValueOrder();
        this.cards.sort(sb);
        this.cards.sort(bs);
    }
}