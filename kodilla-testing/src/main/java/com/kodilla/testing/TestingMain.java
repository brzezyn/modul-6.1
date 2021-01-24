package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        //Testing Calculator class
        Calculator calculator = new Calculator();

        int addResult = calculator.add(5, 5);
        if (addResult == 10) {
            System.out.print("Adding test OK :D git ");
        } else {
            System.out.println("Error!!!");
        }
        int subtractResult = calculator.subtract(7, 5);
        if (subtractResult == 2) {
            System.out.println("Subtracting test OK :D");
        } else {
            System.out.println("Error!!!");
        }
    }
}
