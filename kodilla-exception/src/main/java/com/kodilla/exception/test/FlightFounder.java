package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFounder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("London", true);
        flights.put("Berlin", true);
        flights.put("Amsterdam", false);
        flights.put("Helsinki", true);
        flights.put("Rio", true);

        String arrival = flight.getArrivalAirport();
        String departure = flight.getDepartureAirport();

        if (flights.containsKey(arrival) && flights.containsKey(departure)) {
            return flights.get(arrival) && flights.get(departure);
        } else {
            throw new RouteNotFoundException("That airport does not exist in our base.");
        }
    }

    public static void main(String[] args) {
        FlightFounder flightFounder = new FlightFounder();
        Flight flightOne = new Flight("London", "Rio");
        Flight flightTwo = new Flight("Berlin", "Amsterdam");
        Flight flightThree = new Flight("Helsinki", "Berlin");

        try {
            boolean isPossible = flightFounder.findFlight(flightTwo);
            if (isPossible) {
                System.out.println("You can fly!");
            } else {
                System.out.println("Sorry you can not fly.");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Try again.");
        }
    }
}