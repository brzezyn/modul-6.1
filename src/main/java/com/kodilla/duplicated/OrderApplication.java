package com.kodilla.duplicated;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);

        Random randomGenerator = new Random();
        ArrayList<Order> ordersList = new ArrayList<Order>();
        for(int n = 0; n < 20; n++) {
            ordersList.add(new Order(randomGenerator.nextInt(20)));
        }

        HashSet<Order> ordersSet = new HashSet<Order>();
        for (int n = 0; n < ordersList.size(); n++) {
            ordersSet.add(ordersList.get(n));
        }

        System.out.println("Number or orders: "+ordersList.size()+"\nNumber of unique orders: "+ordersSet.size());
    }

}
