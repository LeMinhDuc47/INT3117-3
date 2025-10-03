package com.example.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InsuranceCalculatorTest {
    @Test
    void testCase1() {
        assertThrows(IllegalArgumentException.class, () -> InsuranceCalculator.calculateInsurance(2, true, 10));
    }

    @Test
    void testCase2() {
        assertThrows(IllegalArgumentException.class, () -> InsuranceCalculator.calculateInsurance(2, true, 0));
    }

    @Test
    void testCase3() {
        assertEquals(2950, InsuranceCalculator.calculateInsurance(20, true, 15));
    }

    @Test
    void testCase4() {
        assertEquals(1100, InsuranceCalculator.calculateInsurance(30, false, 8));
    }

    @Test
    void testCase5() {
        assertEquals(1500, InsuranceCalculator.calculateInsurance(65, false, 2));
    }
}
