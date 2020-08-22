package Lectures.L2_Sorting_Method_as_Lambda_Expression;

import java.util.ArrayList;
import java.util.Collections;

public class sortingBirthYear {
    public static void run(ArrayList<Person> persons) {
        /*
        We want to sort the list without having to implement the Comparable interface.

        Both the `sort` method of the `Collections` class and the stream's `sorted`
        method accept a lambda expression as a parameter that defines the sorting criteria.
        More specifically, both methods can be provided with an object that
        implements the Comparator interface, which defines
        the desired order - the lambda expression is used to create this object.
        */
        persons.stream().sorted((p1, p2) -> {
            return p1.getBirthYear() - p2.getBirthYear();
        }).forEach(p -> System.out.println(p.getName()));

        System.out.println();

        // Original list still the same
        persons.stream().forEach(p -> System.out.println(p.getName()));

        System.out.println();

        // Modified the original list
        Collections.sort(persons, (p1, p2) -> p1.getBirthYear() - p2.getBirthYear());

        persons.stream().forEach(p -> System.out.println(p.getName()));
    }
}
