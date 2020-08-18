package Exercises.E2_Animals;

public abstract class Animal {

    private String name;

    public Animal(String animalName) {
        this.name = animalName;
    }

    public void eat() {
        System.out.println(this.name + " eats");
    }

    public void sleep() {
        System.out.println(this.name + " sleeps");
    }

    public String getName() {
        return this.name;
    }

}
