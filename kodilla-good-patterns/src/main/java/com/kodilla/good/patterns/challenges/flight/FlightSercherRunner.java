package com.kodilla.good.patterns.challenges.flight;

import java.util.Map;
import java.util.Optional;

import static com.kodilla.good.patterns.challenges.flight.MapOfFlights.getMapOfFlights;


public class FlightSercherRunner {

    public static void main(String args[]) {

        String departureAirport = "Berlin";
        Optional<String> intermediateAirport = Optional.ofNullable("Paris");
        String arrivalAirport = "Athens";

        Flight flight = new Flight(departureAirport, intermediateAirport, arrivalAirport);
        FlightSercher flightFinder = new FlightSercher();

        Map<Integer, Flight> mapOfAvailableFlights = getMapOfFlights();

        flightFinder.findFlightWithIntermediateAirport(flight, mapOfAvailableFlights);
        flightFinder.findFlightFromAirport(departureAirport, mapOfAvailableFlights);
        flightFinder.findFlightToAirport(arrivalAirport, mapOfAvailableFlights);
    }
}
