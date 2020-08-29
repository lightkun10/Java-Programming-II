package FlightControl.domain;

public class Flight {
    private Airplane airplane;
    private Place origin;
    private Place destination;
    private int duration;

    public Flight(Airplane airplane, Place originAirport, Place destinationAirport) {
        this(airplane, originAirport, destinationAirport, 0);
    }

    public Flight(Airplane airplane, Place originAirport, Place destinationAirport, int duration) {
        this.airplane = airplane;
        this.origin = originAirport;
        this.destination = destinationAirport;
        this.duration = duration;
    }

    public Airplane getAirplane() {
        return this.airplane;
    }

    public Place getOrigin() {
        return this.origin;
    }

    public Place getDestination() {
        return this.destination;
    }

    public int getDuration() {
        return this.duration;
    }

    @Override
    public String toString() {
        return this.airplane.toString() + " (" + this.origin + "-" + this.destination + ")";
    }
}