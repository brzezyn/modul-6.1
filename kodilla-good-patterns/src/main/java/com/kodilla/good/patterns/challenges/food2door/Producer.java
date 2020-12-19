package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class Producer {

    private final String NAME;
    private final String ADDRESS;
    private final Map<String,Integer> PRODUCTS;

    public Producer(String NAME, String ADDRESS, Map<String, Integer> PRODUCTS) {
        this.NAME = NAME;
        this.ADDRESS = ADDRESS;
        this.PRODUCTS = PRODUCTS;
    }

    public String getNAME() {
        return NAME;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public Map<String, Integer> getPRODUCTS() {
        return PRODUCTS;
    }
}