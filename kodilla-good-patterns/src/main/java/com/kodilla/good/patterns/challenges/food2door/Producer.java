package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class Producer {

    private final String name;
    private final String address;
    private final Map<String,Integer> products;

    public Producer(String name, String address, Map<String, Integer> products) {
        this.name = name;
        this.address = address;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }
}