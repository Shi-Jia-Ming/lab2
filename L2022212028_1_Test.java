import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class L2022212028_1_Test {

    @Test
    void fractionToDecimal() {
        Solution1 solution = new Solution1();

        // Test case 1: numerator = 1, denominator = 2
        assertEquals("0.5", solution.fractionToDecimal(1, 2));

        // Test case 2: numerator = 2, denominator = 1
        assertEquals("2", solution.fractionToDecimal(2, 1));

        // Test case 3: numerator = 4, denominator = 333
        assertEquals("0.(012)", solution.fractionToDecimal(4, 333));

        // Additional test case 4: numerator = 1, denominator = 3 (repeating decimal)
        assertEquals("0.(3)", solution.fractionToDecimal(1, 3));

        // Additional test case 5: numerator = -50, denominator = 8
        assertEquals("-6.25", solution.fractionToDecimal(-50, 8));

        // Additional test case 6: numerator = 7, denominator = -12
        assertEquals("-0.58(3)", solution.fractionToDecimal(7, -12));
    }
}