package Exercises.E4_DifferentKindsOfBoxes;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.capacity - item.getWeight() >= 0) {
            this.items.add(item);
            this.capacity -= item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

}