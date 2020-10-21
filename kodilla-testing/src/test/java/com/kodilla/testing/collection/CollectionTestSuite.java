package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Checking list of numbers.");
    }

    @AfterEach
    public void after() {
        System.out.println("This number are odd.");
    }

    @DisplayName("When create list with no values, " +
            "then one.exterminate(randomNumbers) shouldn't return no values")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> randomNumbers = new ArrayList<>();
        List<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator one = new OddNumbersExterminator();
        //When
        List<Integer> result = one.exterminate(randomNumbers);
        //Then
        Assertions.assertEquals(emptyList, result);
    }

    @DisplayName("When create list with values, " +
            "then one.exterminate(randomNumbers) should return odd number")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator one = new OddNumbersExterminator();
        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(10);
        randomNumbers.add(14);
        randomNumbers.add(25);
        randomNumbers.add(44);
        randomNumbers.add(97);
        randomNumbers.add(55);

        List<Integer> oddNumbers = new ArrayList<>();
        oddNumbers.add(10);
        oddNumbers.add(14);
        oddNumbers.add(44);
        //When
        List<Integer> result = one.exterminate(randomNumbers);
        List<Integer> expected = oddNumbers;
        //Then
        Assertions.assertEquals(expected, result);
    }
}