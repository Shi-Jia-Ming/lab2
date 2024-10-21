import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class L2022212028_11_Test {

    @Test
    public void testThreeSum() {
        Solution solution = new Solution();

        // Test case 1: Standard case with two valid triplets
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result1 = solution.threeSum(nums1);
        assertTrue(result1.contains(List.of(-1, -1, 2)));
        assertTrue(result1.contains(List.of(-1, 0, 1)));

        // Test case 2: No triplets that sum to zero
        int[] nums2 = {0, 1, 1};
        List<List<Integer>> result2 = solution.threeSum(nums2);
        assertEquals(0, result2.size());

        // Test case 3: All zeros, only one valid triplet
        int[] nums3 = {0, 0, 0};
        List<List<Integer>> result3 = solution.threeSum(nums3);
        assertEquals(1, result3.size());
        assertTrue(result3.contains(List.of(0, 0, 0)));

        // Test case 4: Larger case with more numbers
        int[] nums4 = {-4, -1, -1, 0, 1, 2};
        List<List<Integer>> result4 = solution.threeSum(nums4);
        assertTrue(result4.contains(List.of(-1, -1, 2)));
        assertTrue(result4.contains(List.of(-1, 0, 1)));

        // Test case 5: No valid triplets (all positive numbers)
        int[] nums5 = {1, 2, 3};
        List<List<Integer>> result5 = solution.threeSum(nums5);
        assertEquals(0, result5.size());

        // Test case 6: Negative numbers only
        int[] nums6 = {-5, -4, -3, -2, -1};
        List<List<Integer>> result6 = solution.threeSum(nums6);
        assertEquals(0, result6.size()); // No triplets can sum to 0
    }
}
