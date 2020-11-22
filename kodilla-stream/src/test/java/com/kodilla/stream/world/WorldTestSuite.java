package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class WorldTestSuite {

    @Test
    void getPeopleQuantity() {
        //Given
        //Create a list of European countries
        ArrayList<Country> europeCountries = new ArrayList<>();
        europeCountries.add(new Country(new BigDecimal(("38430000")), "Spain"));
        europeCountries.add(new Country(new BigDecimal(("82790000")), "France"));
        europeCountries.add(new Country(new BigDecimal(("60500000")), "Italy"));
        europeCountries.add(new Country(new BigDecimal(("78400000")), "Poland"));
        europeCountries.add(new Country(new BigDecimal(("87300000")), "Netherlands"));
        //Create a list of African countries
        ArrayList<Country> africaCountries = new ArrayList<>();
        africaCountries.add(new Country(new BigDecimal(("76540000")), "Nigeria"));
        africaCountries.add(new Country(new BigDecimal(("54700000")), "RPA"));
        africaCountries.add(new Country(new BigDecimal(("62100000")), "Kongo"));
        africaCountries.add(new Country(new BigDecimal(("87320000")), "Egypt"));
        africaCountries.add(new Country(new BigDecimal(("55600000")), "Sudan"));
        //Create a list of South American countries
        ArrayList<Country> southAmericaCountries = new ArrayList<>();
        southAmericaCountries.add(new Country(new BigDecimal(("20984000")), "Peru"));
        southAmericaCountries.add(new Country(new BigDecimal(("34000000")), "Brazil"));
        southAmericaCountries.add(new Country(new BigDecimal(("54670000")), "Chile"));
        southAmericaCountries.add(new Country(new BigDecimal(("72830000")), "Argentine"));
        southAmericaCountries.add(new Country(new BigDecimal(("30467000")), "Columbia"));
        //Create a list of Asian countries
        ArrayList<Country> asiaCountries = new ArrayList<>();
        asiaCountries.add(new Country(new BigDecimal(("93890000")), "China"));
        asiaCountries.add(new Country(new BigDecimal(("72900000")), "Japan"));
        asiaCountries.add(new Country(new BigDecimal(("56790000")), "Russia"));
        asiaCountries.add(new Country(new BigDecimal(("45621000")), "India"));
        asiaCountries.add(new Country(new BigDecimal(("45890000")), "North Korea"));
        //Create a list of continents
        List<Continent> continentsList = new ArrayList<>();
        continentsList.add(new Continent(europeCountries, "Europe"));
        continentsList.add(new Continent(africaCountries, "Africa"));
        continentsList.add(new Continent(southAmericaCountries, "South America"));
        continentsList.add(new Continent(asiaCountries, "Asia"));

        World earth = new World(continentsList);

        //When
        BigDecimal totalPeople = earth.getPeopleQuantity();
        System.out.println(totalPeople);
        BigDecimal expectedPeople = new BigDecimal("1211722000");

        //Then
        Assertions.assertEquals(expectedPeople, totalPeople);

    }
}
