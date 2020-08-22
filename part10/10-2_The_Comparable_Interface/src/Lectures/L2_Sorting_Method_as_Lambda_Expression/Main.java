package Lectures.L2_Sorting_Method_as_Lambda_Expression;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Ada Lovelace", 1815));
        persons.add(new Person("Irma Wyman", 1928));
        persons.add(new Person("Grace Hopper", 1906));
        persons.add(new Person("Mary Coombs", 1929));

        System.out.println("What do you want to do?");

        sortingBirthYear.run(persons);

        comparingString.run(persons);
    }
}
