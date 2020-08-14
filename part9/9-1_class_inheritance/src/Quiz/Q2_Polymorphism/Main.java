package Quiz.Q2_Polymorphism;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Pandu", 26, 140);
        // System.out.println(student.exclusiveToStudent());

        Person person = student;
        Object object = student;

        System.out.print(student + ", ");
        System.out.print(person + ", ");
        System.out.println(object + ".");
    }
}
