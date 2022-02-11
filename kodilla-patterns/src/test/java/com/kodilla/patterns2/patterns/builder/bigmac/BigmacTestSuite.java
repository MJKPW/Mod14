package com.kodilla.patterns2.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    public void bigMackTest() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                                  .burgers(2)
                                  .bun("sesame")
                                  .sauce("standard")
                                  .ingredients("shrimps")
                                  .ingredients("onions")
                                  .ingredients("beacon")
                                  .build();
        //When
        System.out.println(bigmac);
        //Then
        Assertions.assertEquals(2, bigmac.getBurgers());
        Assertions.assertEquals("sesame", bigmac.getBun());
        Assertions.assertEquals("standard", bigmac.getSauce());
        Assertions.assertEquals(3, bigmac.getIngredients().size());
    }

    @Test
    public void bigMackTestWrongBurgers() {
        //Given
        //When
        //Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            final Bigmac bigmac = new Bigmac.BigmacBuilder()
                                            .burgers(-2)
                                            .bun("sesame")
                                            .sauce("standard")
                                            .ingredients("shrimps")
                                            .ingredients("onions")
                                            .ingredients("beacon")
                                            .build();
        });
    }

    @Test
    public void bigMackTestWrongBun() {
        //Given
        //When
        //Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            final Bigmac bigmac = new Bigmac.BigmacBuilder()
                                            .burgers(2)
                                            .bun("no sesame")
                                            .sauce("standard")
                                            .ingredients("shrimps")
                                            .ingredients("onions")
                                            .ingredients("beacon")
                                            .build();
        });
    }

    @Test
    public void bigMackTestWrongSauce() {
        //Given
        //When
        //Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            final Bigmac bigmac = new Bigmac.BigmacBuilder()
                                            .burgers(2)
                                            .bun("sesame")
                                            .sauce("garlic")
                                            .ingredients("shrimps")
                                            .ingredients("onions")
                                            .ingredients("beacon")
                                            .build();
        });
    }

    @Test
    public void bigMackTestWrongIngredients() {
        //Given
        //When
        //Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            final Bigmac bigmac = new Bigmac.BigmacBuilder()
                                            .burgers(2)
                                            .bun("sesame")
                                            .sauce("garlic")
                                            .ingredients("pineapple")
                                            .ingredients("onions")
                                            .ingredients("beacon")
                                            .build();
        });
    }
}