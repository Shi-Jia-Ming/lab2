import org.junit.Test;
import static org.junit.Assert.*;

public class L2022212028_12_Test {

    @Test
    public void testMultiply() {
        Solution12 solution = new Solution12();

        // Test case 1: Small numbers
        String result1 = solution.multiply("2", "3");
        assertEquals("6", result1);

        // Test case 2: Larger numbers
        String result2 = solution.multiply("123", "456");
        assertEquals("56088", result2);

        // Test case 3: Zero multiplication
        String result3 = solution.multiply("0", "12345");
        assertEquals("0", result3);

        // Test case 4: Large numbers multiplication
        String result4 = solution.multiply("999", "999");
        assertEquals("998001", result4);

        // Test case 5: Multiplication with powers of 10
        String result5 = solution.multiply("100", "1000");
        assertEquals("100000", result5);
    }
}
