package com.kodilla.good.patterns.challenges.flight;

import java.time.LocalTime;
import java.time.Duration;

import java.time.LocalTime;
import java.time.Duration;

public class Flight {

    private final Airport departure;
    private final Airport arrival;
    private final LocalTime depTime;
    private final Duration duration;
    private final LocalTime arrTime;

    public Flight(Airport departure, Airport arrival, LocalTime depTime, Duration duration) {
        this.departure = departure;
        this.arrival = arrival;
        this.depTime = depTime;
        this.duration = duration;
        this.arrTime = depTime.plusMinutes(duration.toMinutes());
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    public LocalTime getDepTime() {
        return depTime;
    }

    public LocalTime getArrTime() {
        return arrTime;
    }

    @Override
    public String toString() {
        return "Flight " +
                " from " + departure +
                " (" + depTime + ")" +
                " to " + arrival +
                " (" + arrTime + ")" +
                " (duration " + duration.toMinutes() + " minutes)";
    }
}