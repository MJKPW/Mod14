package com.kodilla.patterns2.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User yGen = new YGeneration("Wojciech");
        User millennial = new Millenials("Jan");
        User zGen = new ZGeneration("Tomasz");
        //When
        //Then
        Assertions.assertEquals("Facebook", yGen.sharePublisher());
        Assertions.assertEquals("Twitter", millennial.sharePublisher());
        Assertions.assertEquals("Snapchat", zGen.sharePublisher());
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User zGen = new ZGeneration("Tomasz");
        //When
        zGen.setSocialPublisher(new TwitterPublisher());
        //Then
        Assertions.assertEquals("Twitter", zGen.sharePublisher());
    }
}
