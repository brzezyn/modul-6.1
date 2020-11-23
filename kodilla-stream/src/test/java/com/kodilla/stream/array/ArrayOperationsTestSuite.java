package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {3, 4, 7, 8, 11, 12, 15, 16, 19, 20, 23, 24, 27, 28, 31, 32, 35, 36, 39, 40};
        //When
        double averageResult = ArrayOperations.getAverage(numbers);
        double averageExpected = 21.5;
        //Then
        Assertions.assertEquals(averageExpected, averageResult);
    }
}
