package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondChallengeTestSuite {

    @Test
    void probablyWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        Assertions.assertAll(
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(5, 7)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(10, 29)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3, 3)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1))
        );

    }

    @Test
    void whenTestedMethodDoesNotTrowException() { //w tych testach uwzględnmiamy przypadki brzegowe
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        Assertions.assertAll(
                () -> Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 1)),
                () -> Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 2))
        );
    }
}
