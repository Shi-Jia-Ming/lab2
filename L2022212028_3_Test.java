import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class L2022212028_3_Test {

    @Test
    public void testLargestDivisibleSubset() {
        Solution3 solution = new Solution3();

        // Test case 1: nums = [1, 2, 3]
        List<Integer> result1 = solution.largestDivisibleSubset(new int[]{1, 2, 3});
        assertTrue(Arrays.asList(1, 2).equals(result1) || Arrays.asList(1, 3).equals(result1));

        // Test case 2: nums = [1, 2, 4, 8]
        List<Integer> result2 = solution.largestDivisibleSubset(new int[]{1, 2, 4, 8});
        assertEquals(Arrays.asList(1, 2, 4, 8), result2);

        // Additional test case 3: nums = [3, 4, 16, 8]
        List<Integer> result3 = solution.largestDivisibleSubset(new int[]{3, 4, 16, 8});
        assertEquals(Arrays.asList(4, 8, 16), result3);

        // Additional test case 4: nums = [1]
        List<Integer> result4 = solution.largestDivisibleSubset(new int[]{1});
        assertEquals(Arrays.asList(1), result4);

        // Additional test case 5: nums = [1, 2, 3, 6, 18, 36]
        List<Integer> result5 = solution.largestDivisibleSubset(new int[]{1, 2, 3, 6, 18, 36});
        assertEquals(Arrays.asList(1, 2, 6, 18, 36), result5);
    }
}
