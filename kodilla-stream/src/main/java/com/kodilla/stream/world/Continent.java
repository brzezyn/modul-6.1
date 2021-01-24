package com.kodilla.stream.world;

import java.util.List;

public final class Continent {

    private final List<Country> countries;
    private final String continentName;

    public Continent(final List<Country> countries, final String continentName) {
        this.countries = countries;
        this.continentName = continentName;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public String getName() {
        return continentName;
    }
}
