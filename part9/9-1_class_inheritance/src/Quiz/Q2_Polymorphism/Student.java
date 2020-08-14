package Quiz.Q2_Polymorphism;

public class Student extends Person {

    private int credits;

    public Student(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    @Override
    public String toString() {
        return super.toString() + credits + " credits";
    }

    public String exclusiveToStudent() {
        return "This will print only to object that reference to Student AND stored as Student object";
    }
}
