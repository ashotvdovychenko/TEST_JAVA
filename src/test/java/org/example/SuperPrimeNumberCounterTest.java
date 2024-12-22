package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuperPrimeNumberCounterTest {

    private final SuperPrimeNumberCounter superPrimeNumberCounter = new SuperPrimeNumberCounter();

    @Test
    public void countSuperPrimeNumbers_WithLimitIs1000() {
        var expectedCount = Integer.valueOf(25);

        var actualCount = superPrimeNumberCounter.apply(241);

        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void countSuperPrimeNumbers_WithLimitLessThanZero() {
        var expectedCount = Integer.valueOf(0);

        var actualCount = superPrimeNumberCounter.apply(-1);

        assertEquals(expectedCount, actualCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void countSuperPrimeNumbers_WithLimitOver1000() {
        superPrimeNumberCounter.apply(1001);
    }
}
