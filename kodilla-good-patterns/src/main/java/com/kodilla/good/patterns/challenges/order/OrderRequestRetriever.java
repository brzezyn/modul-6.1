package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Arnold", "Bush", "a_bush");
        Cd cd = new Cd("Michael Buble", "Christmas", 2011, "0856");
        LocalDateTime orderDate = LocalDateTime.now();

        return new OrderRequest(user, cd, orderDate);
    }
}
