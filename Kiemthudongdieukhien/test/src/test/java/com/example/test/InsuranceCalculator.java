package com.example.test;

public class InsuranceCalculator {
    public static int calculateInsurance(int age, boolean hasPreexistingCondition, int termYears) {
        if (age < 10 || age > 120) {
            throw new IllegalArgumentException("Invalid age");
        }
        if (termYears < 1 || termYears > 100) {
            throw new IllegalArgumentException("Invalid termYears");
        }

        int base;
        double termPercent;
        if (age < 25) {
            base = 3000;
        } else if (age <= 64) {
            base = 1000;
        } else {
            base = 1500;
        }

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

        return (int) Math.round(amount);
    }
}