package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("this is the content of a log");
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assertions.assertEquals("this is the content of a log", result);
    }
}
