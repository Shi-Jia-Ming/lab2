import org.junit.Test;
import static org.junit.Assert.*;

public class L2022212028_13_Test {

    @Test
    public void testSortColors() {
        Solution13 solution = new Solution13();

        // Test case 1: General case with all colors
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums1);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums1);

        // Test case 2: General case with no red (0)
        int[] nums2 = {2, 1, 1, 2};
        solution.sortColors(nums2);
        assertArrayEquals(new int[]{1, 1, 2, 2}, nums2);

        // Test case 3: Already sorted array
        int[] nums3 = {0, 0, 1, 1, 2, 2};
        solution.sortColors(nums3);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums3);

        // Test case 4: Single element
        int[] nums4 = {1};
        solution.sortColors(nums4);
        assertArrayEquals(new int[]{1}, nums4);

        // Test case 5: Two elements
        int[] nums5 = {2, 0};
        solution.sortColors(nums5);
        assertArrayEquals(new int[]{0, 2}, nums5);
    }
}
