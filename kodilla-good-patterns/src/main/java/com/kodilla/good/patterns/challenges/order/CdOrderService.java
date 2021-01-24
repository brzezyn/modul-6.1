package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CdOrderService implements OrderService {

    public boolean order(User user, Cd cd, LocalDateTime orderDate) {
        System.out.println("\"" + cd.getTitle() + "\"" + " has been ordered" +
                " by " + user.getNICKNAME() + ", " +
                orderDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        return true;
    }
}
