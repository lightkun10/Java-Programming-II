package Lectures.L3_Describing_class_methods;

public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.name = initialName;
        this.age = 0;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " +   this.age + " years");
    }

    public String getName() {
        return this.name;
    }

    /*
    In a class diagram, we list all class methods including the constructors;
    constructors are listed first and then all class methods.
    We also write the return type of a method in the class diagram.
    */
}
