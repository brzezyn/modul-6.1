package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] arg) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(5, 7));
        } catch (Exception e) {
            System.out.println("Try again");
        }
    }
}
