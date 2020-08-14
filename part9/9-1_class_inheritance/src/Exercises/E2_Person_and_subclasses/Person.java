package Exercises.E2_Person_and_subclasses;

public class Person {
    // Instance Variable
    private String name;
    private String address;

    public Person() {
        this("No Name", "No Address");
    }

    public Person(String iName, String iAddress) {
        this.name = iName;
        this.address = iAddress;
    }

    public String toString() {
        return this.name + "\n  " + this.address;
    }
}