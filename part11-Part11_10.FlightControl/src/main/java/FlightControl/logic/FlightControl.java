package FlightControl.logic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;

/**
 * FlightControll
 */
public class FlightControl {
	private Map<String, Airplane> airplanes = new HashMap<>();
	private Map<String, Flight> flights = new HashMap<>();
	private Map<String, Place> places = new HashMap<>();

	public void addAirplane(String id, int capicity) {
		airplanes.putIfAbsent(id, new Airplane(id, capicity));
	}

	public void addFlight(Airplane airplane, String departureAirport, String targetAirport) {
		places.putIfAbsent(departureAirport, new Place(departureAirport));
		places.putIfAbsent(targetAirport, new Place(targetAirport));
		Flight flight = new Flight(airplane, places.get(departureAirport), places.get(targetAirport));
		flights.putIfAbsent(flight.toString(), flight);
	}

	public Collection<Airplane> getAirplanes() {
		return airplanes.values();
	}

	public Collection<Flight> getFlights() {
		return flights.values();
	}

	public Airplane getAirplane(String id) {
		return airplanes.get(id);
	}
}