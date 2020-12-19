package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class ExtraFoodShop implements OrderService {

    public boolean process(OrderRequest orderRequest, Map<String, Integer> productsAvailable){
        System.out.println("Process 3");
        return true;
    }
}
