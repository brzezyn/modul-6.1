package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class CalculatorTestSuite {

    @Test
    public void testAddFunction() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(6.0, 3.0);
        //Then
        Assertions.assertEquals(addResult, 9.0, 0.0);
    }

    @Test
    public void testSubFunction() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double subResult = calculator.sub(6.0, 3.0);
        //Then
        Assertions.assertEquals(subResult, 3.0, 3.0);
    }

    @Test
    public void testMulFunction() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double mulResult = calculator.mul(6.0, 3.0);
        //Then
        Assertions.assertEquals(mulResult, 18.0, 0.0);
    }

    @Test
    public void testDivFunction() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double divResult = calculator.div(6.0, 3.0);
        //Then
        Assertions.assertEquals(divResult, 2.0, 0.5);
    }
}