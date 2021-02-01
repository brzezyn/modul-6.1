package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacBuilder {
    @Test
    void testBigmacNew() {
        //GIVEN
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame")
                .burgers(3)
                .sauce("barbecue")
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("salad")
                .ingredient("shrimps")
                .ingredient("chess")
                .build();
        System.out.println(bigmac);
        //WHEN
        int howManyIngredients = bigmac.getIngredients().size();
        //THEN
        Assertions.assertEquals(5, howManyIngredients);
    }
}
