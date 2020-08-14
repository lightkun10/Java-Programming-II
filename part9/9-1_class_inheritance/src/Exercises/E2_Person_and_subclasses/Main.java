package Exercises.E2_Person_and_subclasses;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);

        Person olliePerson = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(olliePerson);

        Object ollieObject = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollieObject);


    }

    // Prints all the persons on the list given as the parameter.
    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}