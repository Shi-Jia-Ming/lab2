import org.junit.Test;
import static org.junit.Assert.*;

public class L2022212028_4_Test {

    @Test
    public void testMaximumGap() {
        Solution4 solution = new Solution4();

        // Test case 1: nums = [3,6,9,1]
        assertEquals(3, solution.maximumGap(new int[]{3, 6, 9, 1}));

        // Test case 2: nums = [10]
        assertEquals(0, solution.maximumGap(new int[]{10}));

        // Additional test case 3: nums = [1, 10000000]
        assertEquals(9999999, solution.maximumGap(new int[]{1, 10000000}));

        // Additional test case 4: nums = [1, 3, 7, 9, 15]
        assertEquals(6, solution.maximumGap(new int[]{1, 3, 7, 9, 15}));

        // Additional test case 5: nums = [100, 300, 1000, 4000, 9000]
        assertEquals(5000, solution.maximumGap(new int[]{100, 300, 1000, 4000, 9000}));
    }
}
