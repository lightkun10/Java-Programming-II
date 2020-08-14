package Exercises.E2_Person_and_subclasses;

public class Student extends Person {
    // Instance Variable
    private int studyCredits;

    // Constructor
    public Student(String studName, String studAddr) {
        super(studName, studAddr);
        this.studyCredits = 0;
    }

    public int credits() {
        return this.studyCredits;
    }

    // Every time a student studies, the amount
    // of study credits goes up.
    public void study() {
        this.studyCredits++;
    }

    // Change the toString method of Person class
    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.studyCredits;
    }
}
