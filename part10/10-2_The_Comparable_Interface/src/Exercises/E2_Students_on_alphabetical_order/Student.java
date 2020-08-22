package Exercises.E2_Students_on_alphabetical_order;

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student oStudent) {
        /* String already implements Comparable itself. */
        // return this.name.compareTo(oStudent.getName());
        return this.name.compareToIgnoreCase(oStudent.getName());
    }
}