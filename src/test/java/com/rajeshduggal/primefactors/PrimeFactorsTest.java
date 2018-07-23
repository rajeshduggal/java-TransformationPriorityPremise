package com.rajeshduggal.primefactors;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;

public class PrimeFactorsTest {
    @Test
    public void primeFactors() throws Exception {
        assertEquals(Arrays.asList(), PrimeFactors.of(1));
    }
}