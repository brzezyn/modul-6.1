package com.kodilla.good.patterns.challenges.flight;

import java.util.List;

import static com.kodilla.good.patterns.challenges.flight.Connections.*;


public class FlightProcessor {

    Connections connections;
    Searcher searcher;
    Information info;

    public FlightProcessor(Connections connections) {
        this.connections = connections;
        this.searcher = new Searcher(connections.getList());
        this.info = new Information();
    }

    public void run() {
        processSearchByDeparture(gda);
        processSearchByArrival(ldz);
        processSearchByBothLocalizations(gda, ldz);
        processSearchByBothLocalizationsWithChange(gda, ldz, kra);
    }

    private void processSearchByDeparture(Airport departure) {
        List<Flight> results = searcher.searchByDeparture(departure);
        info.searchByDeparture(results);
    }

    private void processSearchByArrival(Airport arrival) {
        List<Flight> results = searcher.searchByArrival(arrival);
        info.searchByArrival(results);
    }

    private void processSearchByBothLocalizations(Airport departure, Airport arrival) {
        List<Flight> results = searcher.searchByBothLocalizations(departure, arrival);
        info.searchByBothLocalizations(results);
    }

    private void processSearchByBothLocalizationsWithChange(Airport departure, Airport arrival, Airport change) {
        List<List<Flight>> results = searcher.searchByBothLocalizationsWithChange(departure, arrival, change);
        info.searchByBothLocalizationsWithChange(results);
    }
}