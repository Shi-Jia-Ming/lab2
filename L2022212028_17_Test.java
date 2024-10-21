import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class L2022212028_17_Test {

    @Test
    public void testFindRepeatedDnaSequences() {
        Solution solution = new Solution();

        // Test case 1
        String s1 = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> result1 = solution.findRepeatedDnaSequences(s1);
        assertTrue(result1.contains("AAAAACCCCC"));
        assertTrue(result1.contains("CCCCCAAAAA"));
        assertEquals(2, result1.size());

        // Test case 2
        String s2 = "AAAAAAAAAAAAA";
        List<String> result2 = solution.findRepeatedDnaSequences(s2);
        assertTrue(result2.contains("AAAAAAAAAA"));
        assertEquals(1, result2.size());

        // Test case 3: No repeating sequences
        String s3 = "ACGTAGCTAGCTAG";
        List<String> result3 = solution.findRepeatedDnaSequences(s3);
        assertTrue(result3.isEmpty());

        // Test case 4: Only one sequence
        String s4 = "AAAAAAAACCC";
        List<String> result4 = solution.findRepeatedDnaSequences(s4);
        assertTrue(result4.isEmpty());

        // Test case 5: All sequences repeated
        String s5 = "AAAAAAAAAA";
        List<String> result5 = solution.findRepeatedDnaSequences(s5);
        assertTrue(result5.contains("AAAAAAAAAA"));
        assertEquals(1, result5.size());
    }
}
