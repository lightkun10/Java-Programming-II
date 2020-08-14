package Exercises.E4_DifferentKindsOfBoxes;

import java.util.ArrayList;

/*
You can add any items to a misplacing box, but items can never
be found when looked for. In other words adding to the box must
always succeed, but calling the method isInBox must always return false.
*/

public class MisplacingBox extends Box {

    private ArrayList<Item> items;

    public MisplacingBox() {
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        this.items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }

}