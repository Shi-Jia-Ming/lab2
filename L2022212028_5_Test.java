import org.junit.Test;
import static org.junit.Assert.*;

public class L2022212028_5_Test {

    @Test
    public void testNumSubseq() {
        Solution5 solution = new Solution5();

        // Test case 1: nums = [3,5,6,7], target = 9
        assertEquals(4, solution.numSubseq(new int[]{3, 5, 6, 7}, 9));

        // Test case 2: nums = [3,3,6,8], target = 10
        assertEquals(6, solution.numSubseq(new int[]{3, 3, 6, 8}, 10));

        // Test case 3: nums = [2,3,3,4,6,7], target = 12
        assertEquals(61, solution.numSubseq(new int[]{2, 3, 3, 4, 6, 7}, 12));

        // Test case 4: nums = [1, 1, 1], target = 2
        assertEquals(7, solution.numSubseq(new int[]{1, 1, 1}, 2));

        // Test case 5: nums = [1, 2, 3, 4, 5], target = 5
        assertEquals(11, solution.numSubseq(new int[]{1, 2, 3, 4, 5}, 5));
    }
}
