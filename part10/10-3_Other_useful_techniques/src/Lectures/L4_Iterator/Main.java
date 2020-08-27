package Lectures.L4_Iterator;


public class Main {
    public static void main(String[] args) {
        Card firstH = new Card(10, Suit.HEART);
        Card firstS = new Card(8, Suit.SPADE);

        Hand panduHand = new Hand();
        panduHand.add(firstH);
        panduHand.add(firstS);
        panduHand.print();

        Card takeC = new Card(4, Suit.CLUB);
        panduHand.add(takeC);
        System.out.println();
        panduHand.print();

        panduHand.removeWorst(9);
        System.out.println();
        panduHand.print();

    }
}
