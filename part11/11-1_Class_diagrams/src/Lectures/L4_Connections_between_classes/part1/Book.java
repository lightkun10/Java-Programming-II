package Lectures.L4_Connections_between_classes.part1;

import java.util.ArrayList;

public class Book {
    private String name;
    private String publisher;
    // private Person author;       // Book-to-Person
    private ArrayList<Person> authors;  // Book-to-many-Person

    // Constructor
    public ArrayList<Person> getAuthors() {
        return this.authors;
    }

    public void addAuthor(Person author) {
        this.authors.add(author);
    }

    /*
    In a class diagram variables which refer to other objects
    are not written with the rest of the class attributes,
    but are shown as connections between the classes.
    In the class diagram we have the classes Person and Book,
    and the connection between them.

    The arrow shows the direction of the connection.
    The connection in Book-to-Person-diagram or Book-to-many-Person
    file shows that a Book knows its author but a Person
    does not know about books they are the author of.
    We can also add a label to the arrow to describe the connection.
    In the above diagram the arrow has an accompanying label
    telling us that a Book has an author.

    In a class diagram shown in Book-to-many-Person, situation is
    described by adding a star (*) to the end of the arrow showing the
    connection between the classes. The star tells us that a book
    can have between 0 and unlimited number of authors.
    In that diagram file we have not amended the label to describe
    the multiplicity of the connection, but it would be a good idea
    for the sake of clarity.
    */
}
