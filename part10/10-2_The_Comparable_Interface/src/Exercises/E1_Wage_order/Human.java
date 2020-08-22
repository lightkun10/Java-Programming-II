package Exercises.E1_Wage_order;

public class Human implements Comparable<Human> {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }

    @Override
    public int compareTo(Human otherHuman) {
        // From highest to lowest
        return otherHuman.getWage() - this.wage;

        // From lowest to highest
        // return this.wage - otherHuman.getWage();
    }

}
