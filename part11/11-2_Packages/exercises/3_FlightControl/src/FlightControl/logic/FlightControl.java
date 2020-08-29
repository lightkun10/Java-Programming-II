package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FlightControl {

    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private Map<String, Place> places;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAirplane(String id, int capacity) {
        Airplane plane = new Airplane(id, capacity);
        this.airplanes.put(id, plane);
    }

    public void addFlight(Airplane plane, String origin, String destination) {
        // Put the origin and destination first
        // if it is not yet in the list of available place
        if (!this.places.containsKey(origin)) {
            this.places.put(origin, new Place(origin));
        }

        if (!this.places.containsKey(destination)) {
            this.places.put(destination, new Place(destination));
        }

        Flight flight = new Flight(plane, this.places.get(origin), this.places.get(destination));
        this.flights.put(flight.toString(), flight);
    }

    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Airplane getAirplane(String id) {
        return this.airplanes.get(id);
    }
}