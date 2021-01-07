package com.kodilla.good.patterns.challenges.flight;

import java.time.Duration;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public class Connections {

    public static Airport ldz = new Airport("LDZ");
    public static Airport gda = new Airport("GDA");
    public static Airport kra = new Airport("KRA");

    private List<Flight> list = new LinkedList<>();

    public Connections() {
        add(gda, ldz, 6, 0,  180);
        add(gda, ldz, 13, 45, 180);
        add(gda, ldz, 19, 30, 180);

        add(gda, kra, 10, 30, 120);
        add(gda, kra, 15, 30, 120);

        add(kra, ldz, 13, 0, 60);
        add(kra, ldz, 18, 15, 60);
    }

    public void add(Airport departure, Airport arrival, int hour, int minute, long duration) {
        list.add(new Flight(departure, arrival, LocalTime.of(hour, minute, 0, 0), Duration.ofMinutes(duration)));
    }

    @Override
    public String toString() {
        String string = "\nALL AVAILABLE FLIGHTS: ";
        for(Flight f : list) string += "\n" + f;
        return string;
    }

    public List<Flight> getList() {
        return list;
    }
}
