package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class OrderProcessor {

    private final OrderService orderService;

    public OrderProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderDto process(final OrderRequest orderRequest) {

        Producer producer = orderRequest.getProducer();
        Map<String, Integer> productsAvailable = producer.getPRODUCTS();

        boolean isOrdered = orderService.process(orderRequest, productsAvailable);

        if (isOrdered) {
            return new OrderDto(producer, true);
        } else {
            return new OrderDto(producer, false);
        }
    }
}