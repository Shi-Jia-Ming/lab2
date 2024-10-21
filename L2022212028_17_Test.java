import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class L2022212028_17_Test {

    @Test
    public void testFindRepeatedDnaSequences() {
        Solution solution = new Solution();
        /**
         * 输入字符串 s1 包含多个重复的序列，如 "AAAAACCCCC" 和 "CCCCCAAAAA"。
         * 预期结果是一个包含两个重复序列的列表：["AAAAACCCCC", "CCCCCAAAAA"]。
         */
        String s1 = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> result1 = solution.findRepeatedDnaSequences(s1);
        assertTrue(result1.contains("AAAAACCCCC"));
        assertTrue(result1.contains("CCCCCAAAAA"));
        assertEquals(2, result1.size());

        /**
         * 输入字符串 s2 由多个 "A" 组成，并且长度大于 10。
         * 预期结果是一个包含一个重复序列的列表：["AAAAAAAAAA"]。
         */
        String s2 = "AAAAAAAAAAAAA";
        List<String> result2 = solution.findRepeatedDnaSequences(s2);
        assertTrue(result2.contains("AAAAAAAAAA"));
        assertEquals(1, result2.size());

        /**
         * 输入字符串 s3 不包含任何重复的序列。
         * 预期结果是一个空列表。
         */
        String s3 = "ACGTAGCTAGCTAG";
        List<String> result3 = solution.findRepeatedDnaSequences(s3);
        assertTrue(result3.isEmpty());

        /**
         * 输入字符串 s4 由多个 "A" 和 "C" 组成，但是没有重复的 10 个字符长的序列。
         * 预期结果也是一个空列表。
         */
        String s4 = "AAAAAAAACCC";
        List<String> result4 = solution.findRepeatedDnaSequences(s4);
        assertTrue(result4.isEmpty());

        /**
         * 输入字符串 s5 由多个 "A" 组成，并且整个字符串就是 10 个字符长的重复序列。
         * 预期结果是一个包含一个重复序列的列表：["AAAAAAAAAA"]
         */
        String s5 = "AAAAAAAAAA";
        List<String> result5 = solution.findRepeatedDnaSequences(s5);
        assertTrue(result5.contains("AAAAAAAAAA"));
        assertEquals(1, result5.size());
    }
}
