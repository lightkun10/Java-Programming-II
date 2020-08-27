package Lectures.L3_Enumerated_Type.E1_Enum;

public class Card {

    // Instance Variables
    private int value;
    private Suit suit;

    // Constructor
    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return suit + " " + value;
    }

    public Suit getSuit() {
        return suit;
    }
    
    public int getValue() {
        return this.value;
    }

}
