import org.junit.Test;
import static org.junit.Assert.*;

public class L2022212028_9_Test {

    @Test
    public void testPossibleBipartition() {
        Solution9 solution = new Solution9();

        // Test case 1: Can be bipartitioned
        int n1 = 4;
        int[][] dislikes1 = {{1, 2}, {1, 3}, {2, 4}};
        assertTrue(solution.possibleBipartition(n1, dislikes1));

        // Test case 2: Cannot be bipartitioned
        int n2 = 3;
        int[][] dislikes2 = {{1, 2}, {1, 3}, {2, 3}};
        assertFalse(solution.possibleBipartition(n2, dislikes2));

        // Test case 3: Another case where bipartition is not possible
        int n3 = 5;
        int[][] dislikes3 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}};
        assertFalse(solution.possibleBipartition(n3, dislikes3));

        // Test case 4: No dislikes, should return true
        int n4 = 4;
        int[][] dislikes4 = {};
        assertTrue(solution.possibleBipartition(n4, dislikes4));

        // Test case 5: Only one pair, should be possible
        int n5 = 2;
        int[][] dislikes5 = {{1, 2}};
        assertTrue(solution.possibleBipartition(n5, dislikes5));

        // Test case 6: Larger group where bipartition is possible
        int n6 = 6;
        int[][] dislikes6 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {1, 6}};
        assertTrue(solution.possibleBipartition(n6, dislikes6));
    }
}
