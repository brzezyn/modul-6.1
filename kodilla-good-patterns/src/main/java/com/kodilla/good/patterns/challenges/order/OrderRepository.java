package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;

public interface OrderRepository {
    boolean createOrder(User user, Cd cd, LocalDateTime orderDate);
}
