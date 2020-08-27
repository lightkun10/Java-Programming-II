package Lectures.L4_Iterator;

/*
Represents the set of cards that a player is holding
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    // Prints each card in the current hand.
//    public void print() {
//        this.cards.stream().forEach(card -> {
//            System.out.println(card);
//        });
//    }

    /*
    ArrayList and other "object containers" that implement the Collection
    interface implement the Iterable interface, and they can also be
    iterated over with the help of an iterator - an object specifically
    designed to go through a particular type of object collection.
    The following is a version of printing the cards that uses an iterator:
    */
    public void print() {
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            // System.out.println(iterator.next());
            /* The object reference returned by the iterator's next method
            can of course also be stored in a variable. As such, the print
            method could also be written in the following way.*/
            Card nextInLine = iterator.next();
            System.out.println(nextInLine);
        }
    }

    /*
    If you want to remove some of the objects from the list during a traversal,
    you can do so using an iterator. Calling the remove method of the iterator
    object neatly removes form the list the item returned by the iterator with
    the previous next call. Here's a working example of the version of the method:
    */
    public void removeWorst(int value) {
        Iterator<Card> iterator = cards.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getValue() < value) {
                // removing from the list the element
                // returned by the previous next-method call
                iterator.remove();
            }
        }
    }

        /*
        forEach assumed that the list is not modified during the traversal.
        Modifying the list (in this case deleting elements) causes
        an error - we can think of the forEach method as getting "confused" here.
        */
//    public void removeWorst(int value) {
//        this.cards.stream().forEach(card -> {
//            if (card.getValue() < value) {
//                this.cards.remove(card);
//            }
//        });
//    }

}
