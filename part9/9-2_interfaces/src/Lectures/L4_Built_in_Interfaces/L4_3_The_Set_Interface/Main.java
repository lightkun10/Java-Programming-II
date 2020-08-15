package Lectures.L4_Built_in_Interfaces.L4_3_The_Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class Main {
    /*
    The Set interface describes functionality related to sets.
    In Java, sets always contain either 0 or 1 amounts of any
    given object. As an example, the set interface is implemented
    by HashSet.
    */
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("one");
        set.add("two");

        for (String element : set) {
            System.out.println(element);
        }

        /*
        Note that HashSet in no way assumes the order of a set
        of elements. If objects created from custom classes are
        added to the HashSet object, they must have both the
        equals and hashCode methods defined.
        */
    }
}
