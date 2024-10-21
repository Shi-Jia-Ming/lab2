import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class L2022212028_20_Test {

    @Test
    public void testFindMinHeightTrees() {
        Solution20 solution = new Solution20();

        // Test case 1
        int n1 = 4;
        int[][] edges1 = {{1, 0}, {1, 2}, {1, 3}};
        List<Integer> expected1 = Arrays.asList(1);
        List<Integer> result1 = solution.findMinHeightTrees(n1, edges1);
        assertTrue(result1.containsAll(expected1) && expected1.containsAll(result1));

        // Test case 2
        int n2 = 6;
        int[][] edges2 = {{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}};
        List<Integer> expected2 = Arrays.asList(3, 4);
        List<Integer> result2 = solution.findMinHeightTrees(n2, edges2);
        assertTrue(result2.containsAll(expected2) && expected2.containsAll(result2));

        // Test case 3: Edge case - single node
        int n3 = 1;
        int[][] edges3 = {};
        List<Integer> expected3 = Arrays.asList(0);
        List<Integer> result3 = solution.findMinHeightTrees(n3, edges3);
        assertEquals(expected3, result3);

        // Test case 4: Edge case - two nodes
        int n4 = 2;
        int[][] edges4 = {{0, 1}};
        List<Integer> expected4 = Arrays.asList(0, 1);
        List<Integer> result4 = solution.findMinHeightTrees(n4, edges4);
        assertTrue(result4.containsAll(expected4) && expected4.containsAll(result4));
    }
}
