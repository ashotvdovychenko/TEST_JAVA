package org.example;

import java.util.function.Function;

public class SuperPrimeNumberCounter implements Function<Integer, Integer> {

    /**
     * Counts the super primes for provided limit
     *
     * @param limit The number to which super primes from 0 will be counted. Max value is 1000
     * @return Count of super prime numbers
     */
    @Override
    public Integer apply(Integer limit) {
        if (limit > 1000) {
            throw new IllegalArgumentException("limit is greater than 1000");
        }

        int count = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                int reversed = reverseNumber(i);
                if (isPrime(reversed)) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Check if provided number is prime
     *
     * @param number The number to check if it is prime
     * @return true if number is prime and false if not
     */
    private boolean isPrime(Integer number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Reverses the provided number
     *
     * @param number The number to reverse
     * @return Reversed number
     */
    private Integer reverseNumber(Integer number) {
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }
}
