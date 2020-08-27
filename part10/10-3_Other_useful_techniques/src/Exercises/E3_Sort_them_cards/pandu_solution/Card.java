package Exercises.E3_Sort_them_cards.pandu_solution;


public class Card implements Comparable<Card> {

    private int value;
    private Suit suit; // Enum

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if(value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }

        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public int compareTo(Card c) {
        // Ascending order

        if (c.getValue() == this.getValue()) {
            // If the cards being compared have same value,
            // they sorted by this order:
            // club first, diamond second, heart third, and spade last.
            return this.suit.ordinal() - c.suit.ordinal();
        }

        // Else if their value are different, order them by their value
        return this.getValue() - c.getValue();
    }
}