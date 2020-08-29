package FlightControl.domain;

public class Airplane {

    private String id;
    private int capacity;

    public Airplane(String id, int capacity) {
        this.capacity = capacity;
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public String toString() {
        return this.id + " (" + this.capacity + " capacity)";
    }

}