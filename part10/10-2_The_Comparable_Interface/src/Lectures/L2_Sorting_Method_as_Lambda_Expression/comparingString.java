package Lectures.L2_Sorting_Method_as_Lambda_Expression;

import java.util.ArrayList;

public class comparingString {
    public static void run(ArrayList<Person> persons) {
        /*
        When comparing strings, we can use the compareTo method
        provided by the String class. The method returns an integer
        that describes the order of both the string given to it as
        a parameter and the string that's calling it.
        */
        persons.stream().sorted((person1, person2) -> {
            return person1.getName().compareTo(person2.getName());
        }).forEach(person -> System.out.println(person.getName()));
    }
}
