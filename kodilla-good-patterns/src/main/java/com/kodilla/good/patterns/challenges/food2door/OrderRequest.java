package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class OrderRequest {
    private Map<String, Integer> products;
    private Producer producer;

    public OrderRequest(Producer producer, Map<String, Integer> products) {
        this.products = products;
        this.producer = producer;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public Producer getProducer() {
        return producer;
    }
}