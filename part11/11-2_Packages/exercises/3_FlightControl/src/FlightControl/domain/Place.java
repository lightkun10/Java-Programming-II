package FlightControl.domain;

public class Place {

    private String ID;

    public Place(String id) {
        this.ID = id;
    }

    @Override
    public String toString() {
        return this.ID;
    }
}