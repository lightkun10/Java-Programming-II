package Exercises.E2_Enum_and_Iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // test your classes here
        Employees university = new Employees();

        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));
        // university.print();

        List<Person>newRecruits = new ArrayList<>();
        newRecruits.add(new Person("Bertrand", Education.BA));
        newRecruits.add(new Person("Bella", Education.PHD));

        university.add(newRecruits);

        university.print();

        university.fire(Education.HS);

        System.out.println("===");
        university.print();
    }
}