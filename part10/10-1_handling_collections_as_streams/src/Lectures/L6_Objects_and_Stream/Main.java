package Lectures.L6_Objects_and_Stream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Person jk = new Person("J. K. Rowling", 1965);
        books.add(new Book(jk, "Harry Potter and the Sorcerer's Stone", 223));
        books.add(new Book(new Person("Stephen King", 1947),  "The Shining", 112));
        books.add(new Book(new Person("Jin Yong", 1924), "Wuxia", 3));

        // Say we have a list of books. Calculating the average of the authors'
        // birth years can be done using stream methods in a way that feels natural.
        // First, we convert the stream of books to a stream of persons, and then
        // we convert the stream of person to a stream of birth years.
        // Finally, we ask the (integer) stream for an average.
        Double averageAuthorsBirthYear = books.stream()
                .map(book -> book.getAuthor())
                .mapToInt(author -> author.getBirthYear())
                .average()
                .getAsDouble();
        System.out.println(averageAuthorsBirthYear);

        // Similarly, the names of the authors of books with the word
        // "Potter" in their titles are outputted the following way.
        books.stream()
                .filter(book -> book.getName().contains("Potter"))
                .map(book -> book.getAuthor())
                .forEach(author -> System.out.println(author));
    }
}
