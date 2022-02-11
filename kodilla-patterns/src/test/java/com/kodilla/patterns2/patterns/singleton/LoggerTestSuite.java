package com.kodilla.patterns2.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {
    @Test
    public void logTest() {
        //Given
        Logger logger = Logger.Instance;
        //When
        logger.log("First log");
        //Then
        Assertions.assertEquals("First log", logger.getLastLog());
    }
}
