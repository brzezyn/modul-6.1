package com.kodilla.good.patterns.challenges.flight;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapOfFlights {

    public static Map<Integer, Flight> getMapOfFlights() {

        Map<Integer, Flight> mapOfAvailableFlights = new HashMap<>();
        mapOfAvailableFlights.put(1, new Flight("Warsaw", Optional.ofNullable("Gdansk"), "Cracow"));
        mapOfAvailableFlights.put(2, new Flight("Berlin", Optional.empty(), "Paris"));
        mapOfAvailableFlights.put(3, new Flight("London", Optional.empty(), "Gdansk"));
        mapOfAvailableFlights.put(4, new Flight("Paris", Optional.ofNullable("Athens"), "Warsaw"));
        mapOfAvailableFlights.put(3, new Flight("London", Optional.ofNullable("Berlin"), "Gdansk"));
        mapOfAvailableFlights.put(5, new Flight("Moscow", Optional.empty(), "Lodz" ));

        return mapOfAvailableFlights;
    }
}
