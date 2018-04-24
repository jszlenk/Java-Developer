package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFilght {

    public void findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warsow", true);
        flights.put("Krakow", true);
        flights.put("Gdansk", false);
        flights.put("Wroclaw", false);

        if (!flights.containsKey(flight.getDepartureAirport())) {
            System.out.println("Flight to " + flight.departureAirport + " is not available");
            throw new RouteNotFoundException("Flight doesn't exist!");
        } else if (flights.get(flight.getDepartureAirport())) {
            System.out.println("Flight to " + flight.departureAirport + " is available");
        } else {
            System.out.println("Flight to " + flight.departureAirport + " is not available. Airport is full");
        }
    }
}
