package Exercises.E2_Enum_and_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    // Adds the given person to the employees list
    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    // Adds the given list of people to the employees list
    public void add(List<Person> peopleToAdd) {
        Iterator iterator = peopleToAdd.iterator();

        while (iterator.hasNext()) {
            this.employees.add((Person) iterator.next());
        }
    }

    // Prints all employees
    public void print() {
        Iterator iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Prints the employees whose education
    // matches the education given as a parameter
    public void print(Education education) {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation() == education) {
                System.out.println(nextInLine);
            }
        }
    }

    // Removes all employees whose education matches
    // the education given as parameter from the employees list
    public void fire(Education education) {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation() == education) {
                iterator.remove();
            }
        }

    }
}