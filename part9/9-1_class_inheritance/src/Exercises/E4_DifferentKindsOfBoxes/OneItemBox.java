package Exercises.E4_DifferentKindsOfBoxes;

import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> oneItem;
    private int capacity;

    public OneItemBox() {
        this.capacity = 1;
        this.oneItem = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.oneItem.size() > 0) {
            return;
        }

        this.oneItem.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return this.oneItem.contains(item);
    }

}