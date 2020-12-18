package com.kodilla.good.patterns.challenges.order;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private Cd cd;
    private LocalDateTime date;


    public OrderRequest(User user, Cd cd, LocalDateTime date) {
        this.user = user;
        this.date = date;
        this.cd = cd;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Cd getCd() {
        return cd;
    }
}
