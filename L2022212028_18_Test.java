import org.junit.Test;
import static org.junit.Assert.*;

public class L2022212028_18_Test {

    @Test
    public void testProductExceptSelf() {
        Solution18 solution = new Solution18();

        // Test case 1
        int[] nums1 = {1, 2, 3, 4};
        int[] expected1 = {24, 12, 8, 6};
        assertArrayEquals(expected1, solution.productExceptSelf(nums1));

        // Test case 2
        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] expected2 = {0, 0, 9, 0, 0};
        assertArrayEquals(expected2, solution.productExceptSelf(nums2));

        // Test case 3: Single element
        int[] nums3 = {5};
        int[] expected3 = {1}; // Since there's only one element, the product except itself is 1.
        assertArrayEquals(expected3, solution.productExceptSelf(nums3));

        // Test case 4: Two elements
        int[] nums4 = {2, 3};
        int[] expected4 = {3, 2};
        assertArrayEquals(expected4, solution.productExceptSelf(nums4));

        // Test case 5: All zeros
        int[] nums5 = {0, 0, 0, 0};
        int[] expected5 = {0, 0, 0, 0}; // The product of all other elements is always 0.
        assertArrayEquals(expected5, solution.productExceptSelf(nums5));

        // Test case 6: Mixed positive and negative
        int[] nums6 = {1, -2, 3, 4};
        int[] expected6 = {-24, 12, -8, -6};
        assertArrayEquals(expected6, solution.productExceptSelf(nums6));
    }
}
