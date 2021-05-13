package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal pizzaOrderCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal("15"), pizzaOrderCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String pizzaDescription = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with: standard dough, tomato sauce, cheese", pizzaDescription);
    }

    @Test
    public void testDoubleCheeseSalamiAndHamPizzaCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        //When
        BigDecimal pizzaPrice = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal("25"), pizzaPrice);
    }

    @Test
    public void testDoubleCheeseSalamiAndHamPizzaDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        //When
        String pizzaDescription = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with: standard dough, tomato sauce, cheese + extra cheese + extra cheese + onion + ham slices",
                pizzaDescription);
    }

}
