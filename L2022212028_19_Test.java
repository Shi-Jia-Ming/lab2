import org.junit.Test;
import static org.junit.Assert.*;

public class L2022212028_19_Test {

    @Test
    public void testGameOfLife() {
        Solution19 solution = new Solution19();

        // Test case 1
        int[][] board1 = {
            {0, 1, 0},
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0}
        };
        int[][] expected1 = {
            {0, 0, 0},
            {1, 0, 1},
            {0, 1, 1},
            {0, 1, 0}
        };
        solution.gameOfLife(board1);
        assertArrayEquals(expected1, board1);

        // Test case 2
        int[][] board2 = {
            {1, 1},
            {1, 0}
        };
        int[][] expected2 = {
            {1, 1},
            {1, 1}
        };
        solution.gameOfLife(board2);
        assertArrayEquals(expected2, board2);
        
        // Test case 3: Edge case - empty board
        int[][] board3 = {};
        solution.gameOfLife(board3);
        assertArrayEquals(new int[][]{}, board3);
        
        // Test case 4: Single cell - alive
        int[][] board4 = {
            {1}
        };
        int[][] expected4 = {
            {0}
        };
        solution.gameOfLife(board4);
        assertArrayEquals(expected4, board4);
        
        // Test case 5: Single cell - dead
        int[][] board5 = {
            {0}
        };
        int[][] expected5 = {
            {0}
        };
        solution.gameOfLife(board5);
        assertArrayEquals(expected5, board5);

        // Test case 6: Larger board with no changes
        int[][] board6 = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        int[][] expected6 = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        solution.gameOfLife(board6);
        assertArrayEquals(expected6, board6);
    }
}
