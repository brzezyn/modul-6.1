package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;

public class CdOrderRepository implements OrderRepository {
    public boolean createOrder(User user, Cd cd, LocalDateTime orderDate) {
        System.out.println("Record: " + user.getNAME() + " " + user.getSURNAME() +
                " (" + user.getNICKNAME() +
                ") " + cd.toString() +
                ", date: " + orderDate);
        return true;
    }
}