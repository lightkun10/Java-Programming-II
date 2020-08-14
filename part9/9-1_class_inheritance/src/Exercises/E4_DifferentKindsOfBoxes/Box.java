package Exercises.E4_DifferentKindsOfBoxes;

import java.util.ArrayList;

public abstract class Box {

    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            Box.this.add(item);
        }
    }

    public abstract void add(Item item);

    public abstract boolean isInBox(Item item);
}
