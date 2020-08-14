package Lectures.L2_Approximate_Comparison_With_HashMap;

public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublished() {
        return this.published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return "Name: " + this.name + " (" + this.published + ")\n"
                + "Content: " + this.content;
    }

    @Override
    public boolean equals(Object comparedObject) {
        // If the variables are located in the same place, they're the same
        if (this == comparedObject) {
            return true;
        }

        // if comparedObject is not of type Book, the objects aren't the same
        if (!(comparedObject instanceof Book)) {
            return false;
        }

        // Convert the object to a Book-object
        Book comparedBook = (Book) comparedObject;

        // If the instance variables of the objects are the same, so are the objects
        if (this.name.equals(comparedBook.name) &&
            this.published == comparedBook.published &&
            this.content.equals(comparedBook.content)) {
            return true;
        }

        // Otherwise, the objects aren't the same
        return false;
    }

    // Make all of the books that share a name are bundled into one group.
    @Override
    public int hashCode() {
        // If the value of the name variable is null,
        // return the year of publication as hash value.
        if (this.name == null) {
            return this.published;
        }

        return this.published + this.name.hashCode();
    }
}
