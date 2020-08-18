package Lectures.L5_Intermediate_Operations;

import java.util.ArrayList;

public class IntermediateOperations {
    public static void main(String[] args) {
        /*
        Intermediate stream operations are methods that return a stream.
        Since the value returned is a stream, we can call intermediate
        operations sequentially. Typical intermediate operations include
        converting a value from one form to another using map and its
        more specific form mapToInt used for converting a stream to an
        integer stream. Other ones include filtering values with filter,
        identifying unique values with distinct, and
        arranging values with sorted (if possible).
        */

        // Problem 1: You'll receive a list of persons. Print the number of persons born before the year 1970.
        // Solution: Use the filter method for filtering through only those
        //           persons who were born before the year 1970. We then count
        //           their number using the method count.
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Fierdy", "Pandu", 1994));
        persons.add(new Person("Hi", "Jessi", 1987));
        persons.add(new Person("John", "Denver", 1988));
        persons.add(new Person("Ada", "Wank", 1956));
        persons.add(new Person("Ada", "Wanker", 1960));
        persons.add(new Person("Dom", "Mazetti", 1969));
        persons.add(new Person("Dom", "Buri", 1990));

        long count = persons.stream()
                .filter(person -> person.getBirthYear() < 1970)
                .count();
        System.out.println("Count: " + count);

        // Problem 2: You'll receive a list of persons. How many persons' first names start with the letter "A"?
        // Solution: Use the filter-method to narrow down the persons to
        //           those whose first name starts with the letter "A".
        //           Afterwards, we'll calculate the number of persons
        //           with the count-method.
        long countA = persons.stream()
                .filter(person -> person.getFirstName().startsWith("A"))
                .count();
        System.out.println("Person(s) that first names start with the letter \"A\": " + countA);

        // Problem 3: You'll receive a list of persons. Print the number of unique first names in alphabetical order
        // Solution: First we'll use the map method to change a stream containing
        //           person objects into a stream containing first names.
        //           After that we'll call the distinct-method, that returns a stream
        //           that only contains unique values. Next, we call the method sorted,
        //           which sorts the strings. Finally, we call the method forEach,
        //           that is used to print the strings.
        persons.stream()
                .map(person -> person.getFirstName())
                .distinct()
                .sorted()
                .forEach(name -> System.out.println(name));

        // The distinct-method described above uses the equals-method that is
        // in all objects for comparing whether two strings are the same.
        // The sorted-method on the other hand is able to sort objects that
        // contain some kind of order — examples of this kind of objects are
        // for example numbers and strings.
    }
}
