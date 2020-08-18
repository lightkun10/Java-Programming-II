package Exercises.E1_Herds;

import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    // Returns a string representation of the positions
    // of the members of the herd, each on its own line.
    public String toString() {
        StringBuilder returnV = new StringBuilder();

        int i = 0;
        while (i < this.herd.size()) {
            if (i == this.herd.size() - 1) {
                returnV.append(this.herd.get(i));
            } else {
                returnV.append(this.herd.get(i)).append("\n");
            }

            i += 1;
        }

        return returnV.toString();
    }

    // Adds an object that implements the Movable interface to the herd.
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    // Moves the herd with by the amount specified by the parameters.
    // Notice that here you have to move each member of the herd.
    @Override
    public void move(int dx, int dy) {
        for (Movable obj : this.herd) {
            obj.move(dx, dy);
        }
    }

}