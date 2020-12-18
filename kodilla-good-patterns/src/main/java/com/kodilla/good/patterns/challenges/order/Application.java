package com.kodilla.good.patterns.challenges.order;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new CdOrderService(), new CdOrderRepository());
        productOrderService.process(orderRequest);
    }
}