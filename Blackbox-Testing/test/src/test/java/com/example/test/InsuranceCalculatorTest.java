package com.example.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InsuranceCalculatorTest {
    // Bộ test case của kiểm thử giá trị biên (Boundary Value Analysis - BVA)
    // @Test
    // void testCase01() {
    // assertThrows(IllegalArgumentException.class, () ->
    // InsuranceCalculator.calculateInsurance(65, true, 0));
    // }

    // // 2. x=65, y=1, T
    // @Test
    // void testCase02() {
    // assertEquals(1000, InsuranceCalculator.calculateInsurance(65, true, 1));
    // }

    // // 3. x=65, y=2, T
    // @Test
    // void testCase03() {
    // assertEquals(1000, InsuranceCalculator.calculateInsurance(65, true, 2));
    // }

    // // 4. x=65, y=50, T
    // @Test
    // void testCase04() {
    // assertEquals(1225, InsuranceCalculator.calculateInsurance(65, true, 50));
    // }

    // // 5. x=65, y=99, T
    // @Test
    // void testCase05() {
    // assertEquals(1225, InsuranceCalculator.calculateInsurance(65, true, 99));
    // }

    // // 6. x=65, y=100, T
    // @Test
    // void testCase06() {
    // assertEquals(1225, InsuranceCalculator.calculateInsurance(65, true, 100));
    // }

    // // 7. x=65, y=101, T
    // @Test
    // void testCase07() {
    // assertThrows(IllegalArgumentException.class, () ->
    // InsuranceCalculator.calculateInsurance(65, true, 101));
    // }

    // // 8. x=9, y=50, T
    // @Test
    // void testCase08() {
    // assertThrows(IllegalArgumentException.class, () ->
    // InsuranceCalculator.calculateInsurance(9, true, 50));
    // }

    // // 9. x=10, y=50, T
    // @Test
    // void testCase09() {
    // assertEquals(2950, InsuranceCalculator.calculateInsurance(10, true, 50));
    // }

    // // 10. x=11, y=50, T
    // @Test
    // void testCase10() {
    // assertEquals(2950, InsuranceCalculator.calculateInsurance(11, true, 50));
    // }

    // // 11. x=119, y=50, T
    // @Test
    // void testCase11() {
    // assertEquals(1225, InsuranceCalculator.calculateInsurance(119, true, 50));
    // }

    // // 12. x=120, y=50, T
    // @Test
    // void testCase12() {
    // assertEquals(1225, InsuranceCalculator.calculateInsurance(120, true, 50));
    // }

    // // 13. x=121, y=50, T
    // @Test
    // void testCase13() {
    // assertThrows(IllegalArgumentException.class, () ->
    // InsuranceCalculator.calculateInsurance(121, true, 50));
    // }

    // // 14. x=65, y=0, F
    // @Test
    // void testCase14() {
    // assertThrows(IllegalArgumentException.class, () ->
    // InsuranceCalculator.calculateInsurance(65, false, 0));
    // }

    // // 15. x=65, y=1, F
    // @Test
    // void testCase15() {
    // assertEquals(1500, InsuranceCalculator.calculateInsurance(65, false, 1));
    // }

    // // 16. x=65, y=2, F
    // @Test
    // void testCase16() {
    // assertEquals(1500, InsuranceCalculator.calculateInsurance(65, false, 2));
    // }

    // // 17. x=65, y=50, F
    // @Test
    // void testCase17() {
    // assertEquals(1725, InsuranceCalculator.calculateInsurance(65, false, 50));
    // }

    // // 18. x=65, y=99, F
    // @Test
    // void testCase18() {
    // assertEquals(1725, InsuranceCalculator.calculateInsurance(65, false, 99));
    // }

    // // 19. x=65, y=100, F
    // @Test
    // void testCase19() {
    // assertEquals(1725, InsuranceCalculator.calculateInsurance(65, false, 100));
    // }

    // // 20. x=65, y=101, F
    // @Test
    // void testCase20() {
    // assertThrows(IllegalArgumentException.class, () ->
    // InsuranceCalculator.calculateInsurance(65, false, 101));
    // }

    // // 21. x=9, y=50, F
    // @Test
    // void testCase21() {
    // assertThrows(IllegalArgumentException.class, () ->
    // InsuranceCalculator.calculateInsurance(9, false, 50));
    // }

    // // 22. x=10, y=50, F
    // @Test
    // void testCase22() {
    // assertEquals(3450, InsuranceCalculator.calculateInsurance(10, false, 50));
    // }

    // // 23. x=11, y=50, F
    // @Test
    // void testCase23() {
    // assertEquals(3450, InsuranceCalculator.calculateInsurance(11, false, 50));
    // }

    // // 24. x=119, y=50, F
    // @Test
    // void testCase24() {
    // assertEquals(1725, InsuranceCalculator.calculateInsurance(119, false, 50));
    // }

    // // 25. x=120, y=50, F
    // @Test
    // void testCase25() {
    // assertEquals(1725, InsuranceCalculator.calculateInsurance(120, false, 50));
    // }

    // // 26. x=121, y=50, F
    // @Test
    // void testCase26() {
    // assertThrows(IllegalArgumentException.class, () ->
    // InsuranceCalculator.calculateInsurance(121, false, 50));
    // }
    // Bộ test của kiểm thử bảng quyết định (Decision Table Testing - DTT)
    @Test
    void testCase01() {
        assertEquals(2500, InsuranceCalculator.calculateInsurance(10, true, 1));
    }

    // 2. x=30, y=1, T
    @Test
    void testCase02() {
        assertEquals(500, InsuranceCalculator.calculateInsurance(30, true, 1));
    }

    // 3. x=65, y=1, T
    @Test
    void testCase03() {
        assertEquals(1000, InsuranceCalculator.calculateInsurance(65, true, 1));
    }

    // 4. x=9, y=1, T (invalid age)
    @Test
    void testCase04() {
        assertThrows(IllegalArgumentException.class, () -> InsuranceCalculator.calculateInsurance(9, true, 1));
    }

    // 5. x=10, y=7, T
    @Test
    void testCase05() {
        assertEquals(2800, InsuranceCalculator.calculateInsurance(10, true, 7));
    }

    // 6. x=30, y=7, T
    @Test
    void testCase06() {
        assertEquals(600, InsuranceCalculator.calculateInsurance(30, true, 7));
    }

    // 7. x=65, y=7, T
    @Test
    void testCase07() {
        assertEquals(1150, InsuranceCalculator.calculateInsurance(65, true, 7));
    }

    // 8. x=10, y=15, T
    @Test
    void testCase09() {
        assertEquals(2950, InsuranceCalculator.calculateInsurance(10, true, 15));
    }

    // 9. x=30, y=15, T
    @Test
    void testCase10() {
        assertEquals(650, InsuranceCalculator.calculateInsurance(30, true, 15));
    }

    // 10. x=65, y=15, T
    @Test
    void testCase11() {
        assertEquals(1225, InsuranceCalculator.calculateInsurance(65, true, 15));
    }

    // 11. x=10, y=0, T (invalid contract)
    @Test
    void testCase13() {
        assertThrows(IllegalArgumentException.class, () -> InsuranceCalculator.calculateInsurance(10, true, 0));
    }

    // 12. x=10, y=1, F
    @Test
    void testCase17() {
        assertEquals(3000, InsuranceCalculator.calculateInsurance(10, false, 1));
    }

    // 13. x=26, y=6, F
    @Test
    void testCase22() {
        assertEquals(1100, InsuranceCalculator.calculateInsurance(26, false, 6));
    }

    // 14. x=65, y=15, F
    @Test
    void testCase27() {
        assertEquals(1725, InsuranceCalculator.calculateInsurance(65, false, 15));
    }
}
