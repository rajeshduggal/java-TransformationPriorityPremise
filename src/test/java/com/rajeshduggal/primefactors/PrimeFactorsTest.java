package com.rajeshduggal.primefactors;

import static org.junit.Assert.assertEquals;
import static com.rajeshduggal.primefactors.PrimeFactors.of;
import static java.util.Arrays.asList;
import org.junit.Test;

public class PrimeFactorsTest {
    @Test
    public void primeFactors() throws Exception {
        assertEquals(asList(), of(1));
        assertEquals(asList(2), of(2));
        assertEquals(asList(3), of(3));
        assertEquals(asList(2, 2), of(4));
    }
}