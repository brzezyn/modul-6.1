package com.kodilla.spring.calculator;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class CalculatorTestSuit {

    @Test
    public void testAddFunction() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        calculator.add(6.0, 3.0);
        //Then
        // do nothing
    }
    @Test
    public void testSubFunction() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        calculator.sub(6.0, 3.0);
        //Then
        // do nothing
    }

    @Test
    public void testMulFunction() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        calculator.mul(6.0, 3.0);
        //Then
        // do nothing
    }

    @Test
    public void testDivFunction() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        calculator.div(6.0, 3.0);
        //Then
        // do nothing
    }
}