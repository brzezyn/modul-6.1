package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        HashMap<String, Integer> productsAvailable = new HashMap<>();
        productsAvailable.put("Carrots", 100);
        productsAvailable.put("Apple", 5);
        productsAvailable.put("Eggs", 100);
        productsAvailable.put("Milk", 30);
        productsAvailable.put("Tomatoes", 40);

        Producer producer = new Producer("ExtraFoodShop", "Gdańsk", productsAvailable);

        HashMap<String, Integer> productsOrdered = new HashMap<>();
        productsOrdered.put("Carrots", 20);
        productsOrdered.put("Apple", 10);
        productsOrdered.put("Banana", 9);
        productsOrdered.put("Ham", 12);

        return new OrderRequest(producer, productsOrdered);
    }
}
