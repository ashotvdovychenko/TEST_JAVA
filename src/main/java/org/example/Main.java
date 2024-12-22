package org.example;

public class Main {
    public static void main(String[] args) {
        int limit;
        try {
            limit = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("%s is not an integer.".formatted(args[0]));
        }

        SuperPrimeNumberCounter superPrimeNumberCounter = new SuperPrimeNumberCounter();
        var count = superPrimeNumberCounter.apply(limit);
        System.out.printf("%d contains %d super prime numbers.\n", limit, count);
    }
}