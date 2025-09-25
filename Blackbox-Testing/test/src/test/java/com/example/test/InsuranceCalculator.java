package com.example.test;

public class InsuranceCalculator {
    public static int calculateInsurance(int age, boolean hasPreexistingCondition, int termYears) {
        // Validate domain
        if (age < 10 || age > 120) {
            throw new IllegalArgumentException("Invalid age: must be between 10 and 120 (inclusive).");
        }
        if (termYears < 1 || termYears > 100) {
            throw new IllegalArgumentException("Invalid termYears: must be between 1 and 100 (inclusive).");
        }

        // Base by age
        int base;
        if (age < 25) {
            base = 3000;
        } else if (age <= 64) {
            base = 1000;
        } else {
            base = 1500;
        }

        // Term adjustment percent
        double termPercent;
        if (termYears >= 10) {
            termPercent = 0.15;
        } else if (termYears >= 5) {
            termPercent = 0.10;
        } else {
            termPercent = 0.0;
        }

        double amount = base + base * termPercent;

        if (hasPreexistingCondition) {
            amount -= 500.0;
        }

        if (amount < 0)
            amount = 0.0;

        // Round to nearest integer USD
        return (int) Math.round(amount);
    }
}