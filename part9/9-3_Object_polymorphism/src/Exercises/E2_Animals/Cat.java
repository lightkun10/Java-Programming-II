package Exercises.E2_Animals;

public class Cat extends Animal implements NoiseCapable {

    public Cat() {
        super("Cat");
    }

    public Cat(String catName) {
        super(catName);
    }

    public void purr() {
        System.out.println(super.getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        this.purr();
    }
}
