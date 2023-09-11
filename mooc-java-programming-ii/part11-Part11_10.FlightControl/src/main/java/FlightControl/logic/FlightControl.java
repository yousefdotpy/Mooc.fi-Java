package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;

import java.util.Collection;
import java.util.HashMap;

public class FlightControl {
    private HashMap<String , Airplane> airplanes;
    private HashMap<String , Flight> flights;
    private HashMap<String , Place> places;

    public FlightControl() {
        airplanes = new HashMap<>();
        flights = new HashMap<>();
        places = new HashMap<>();
    }

    public void addAirplane(String ID, int capacity){
        Airplane airplane = new Airplane(ID, capacity);
        airplanes.put(ID ,airplane);
    }
    public void addFlight(Airplane airplane, String departureID, String destinationID){
        this.places.putIfAbsent(departureID, new Place(departureID));
        this.places.putIfAbsent(destinationID, new Place(destinationID));
        Flight flight = new Flight(airplane, places.get(departureID), places.get(destinationID));
        this.flights.put(flight.toString(), flight);
    }

    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Airplane getAirplane(String ID) {
        return this.airplanes.get(ID);
    }
}
