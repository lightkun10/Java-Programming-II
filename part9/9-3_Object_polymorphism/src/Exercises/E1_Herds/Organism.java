package Exercises.E1_Herds;

public class Organism implements Movable {

    private int x;
    private int y;

    // The class constructor that receives
    // the x and y coordinates of the initial
    // position as its parameters.
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Creates and returns a string representation
    // of the organism. That representation should
    // remind the following: "x: 3; y: 6".
    // Notice that a semicolon is used to separate the coordinates.
    public String toString() {
        return "x: " + this.x + "; y: " + this.y;
    }

    // Moves the object by the values it receives
    // as parameters. The dx variable contains the
    // change to coordinate x, and the dy variable
    // contains the change to the coordinate y.
    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}