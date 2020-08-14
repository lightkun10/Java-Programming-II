package Exercises.E2_Person_and_subclasses;

public class Teacher extends Person {
    // Instance Variables
    private int salary;

    // Constructor
    public Teacher(String tName, String tAddr, int tSal) {
        super(tName, tAddr);
        this.salary = tSal;
    }

    public String toString() {
        return super.toString() + "\n  salary " + this.salary + " euro/month";
    }
}