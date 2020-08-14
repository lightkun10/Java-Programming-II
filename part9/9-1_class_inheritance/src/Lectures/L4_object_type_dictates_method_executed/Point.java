package Lectures.L4_object_type_dictates_method_executed;

public class Point {
    // Instance Variable
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Manhattan distance means the distance between
    // two points if you can only travel in the direction
    // of the coordinate axes. It is used in many
    // navigation algorithms, for example.
    public int manhattanDistanceFromOrigin() {
        return Math.abs(x) + Math.abs(y);
    }

    // This method is not meant for external use,
    // which is why it is defined as protected.
    // Subclasses will still be able to access the method.
    protected String location() {
        return x + ", " + y;
    }

    @Override
    public String toString() {
        return "(" + this.location() + ") distance " + this.manhattanDistanceFromOrigin();
    }

}
