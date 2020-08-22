package Exercises.E2_Students_on_alphabetical_order;

public class Main {

    public static void main(String[] args) {
        Student first = new Student("Aku");
        Student second = new Student("Aapo");
        System.out.println(first.compareTo(second));
    }
}
