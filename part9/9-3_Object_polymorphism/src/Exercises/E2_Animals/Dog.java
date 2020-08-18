package Exercises.E2_Animals;

public class Dog extends Animal implements NoiseCapable {

    public Dog() {
        super("Dog");
    }

    public Dog(String dogName) {
        super(dogName);
    }

    public void bark() {
        System.out.println(super.getName() + " barks");
    }

    @Override
    public void makeNoise() {
        this.bark();
    }
}
