package com.kodilla.duplicated;

public class Order {
    Integer orderNumber;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int GetOrderNumber() {
        return this.orderNumber;
    }

    public int hashCode() {
        return orderNumber.hashCode();
    }

    public boolean equals(Object o) {
        Order e = (Order) o;
        return this.orderNumber.equals(e.orderNumber);
    }

    public String toString() {
        return "Order number: "+ orderNumber;
    }
}

