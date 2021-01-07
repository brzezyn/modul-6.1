package com.kodilla.good.patterns.challenges.flight;

public class Application {
    public static void main(String[] args) {

        Connections connections = new Connections();
        System.out.println(connections);

        FlightProcessor processor = new FlightProcessor(connections);

        processor.run();
    }
}