import org.junit.Test;
import static org.junit.Assert.*;

public class L2022212028_16_Test {

    @Test
    public void testLargestNumber() {
        Solution16 solution = new Solution16();

        // Test case 1
        int[] nums1 = {10, 2};
        assertEquals("210", solution.largestNumber(nums1));

        // Test case 2
        int[] nums2 = {3, 30, 34, 5, 9};
        assertEquals("9534330", solution.largestNumber(nums2));

        // Test case 3: All elements are zero
        int[] nums3 = {0, 0, 0};
        assertEquals("0", solution.largestNumber(nums3));

        // Test case 4: Single digit numbers
        int[] nums4 = {1, 2, 3, 4};
        assertEquals("4321", solution.largestNumber(nums4));

        // Test case 5: Mixed single and multi-digit numbers
        int[] nums5 = {12, 121};
        assertEquals("12121", solution.largestNumber(nums5));
    }
}
