package Lectures.L4_object_type_dictates_method_executed;

public class Point3D extends Point {

    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    protected String location() {
        return super.location() + ", " + this.z;    // the resulting string has the form "x, y, z"
    }

    @Override
    public int manhattanDistanceFromOrigin() {
        // first ask the superclass for the distance based on x and y
        // and add the effect of the z coordinate to that result
        return super.manhattanDistanceFromOrigin() + Math.abs(z);
    }

    // No need to override the Point toString method,
    // as it functions exactly the same
}
