package Exercises.E3_Sort_them_cards.model_solution;

public class Main {
    public static void main(String[] args) {
        // test your code here
        Hand hand = new Hand();

        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(4, Suit.SPADE));
        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(7, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        // Print all card in hand
        hand.print();

        // To test the comparator
        BySuitInValueOrder comparatorBs = new BySuitInValueOrder();
    }
}
