import org.junit.Test;
import static org.junit.Assert.*;

public class L2022212028_8_Test {

    @Test
    public void testNumIslands() {
        Solution8 solution = new Solution8();

        // Test case 1
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, solution.numIslands(grid1));

        // Test case 2
        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, solution.numIslands(grid2));

        // Test case 3: Edge case with no islands
        char[][] grid3 = {
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(0, solution.numIslands(grid3));

        // Test case 4: Single island
        char[][] grid4 = {
                {'1'}
        };
        assertEquals(1, solution.numIslands(grid4));

        // Test case 5: Grid with mixed values
        char[][] grid5 = {
                {'1', '0', '1'},
                {'0', '1', '0'},
                {'1', '0', '1'}
        };
        assertEquals(5, solution.numIslands(grid5));
    }
}
