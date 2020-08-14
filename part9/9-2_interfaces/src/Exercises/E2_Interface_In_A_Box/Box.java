package Exercises.E2_Interface_In_A_Box;

import java.util.ArrayList;

public class Box implements Packable {

    private double maxWeight;
    private ArrayList<Packable> box;

    public Box(double iMW) {
        this.maxWeight = iMW;
        this.box = new ArrayList<>();
    }

    public void add(Packable packableItem) {

        if (this.maxWeight - packableItem.weight() >= 0) {
            this.box.add(packableItem);
            this.maxWeight -= packableItem.weight();
        }
    }

    public double weight() {
        double weight = 0;

        for (Packable item : this.box) {
            weight += item.weight();
        }

        return weight;
    }

    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + Box.this.weight() + " kg";
    }

}