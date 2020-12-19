package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public interface OrderService {

    boolean process(OrderRequest orderRequest, Map<String, Integer> productsAvailable);
}