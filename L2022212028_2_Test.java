import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class L2022212028_2_Test {

    @Test
    public void testRemoveDuplicateLetters() {
        Solution2 solution = new Solution2();

        // Test case 1: s = "bcabc"
        assertEquals("abc", solution.removeDuplicateLetters("bcabc"));

        // Test case 2: s = "cbacdcbc"
        assertEquals("acdb", solution.removeDuplicateLetters("cbacdcbc"));

        // Additional test case 3: s = "abacb"
        assertEquals("abc", solution.removeDuplicateLetters("abacb"));

        // Additional test case 4: s = "a"
        assertEquals("a", solution.removeDuplicateLetters("a"));

        // Additional test case 5: s = "edebcbb"
        assertEquals("debc", solution.removeDuplicateLetters("edebcbb"));
    }
}
