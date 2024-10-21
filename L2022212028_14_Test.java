import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class L2022212028_14_Test {

    @Test
    public void testRestoreIpAddresses() {
        Solution14 solution = new Solution14();

        // Test case 1: General case
        String s1 = "25525511135";
        List<String> result1 = solution.restoreIpAddresses(s1);
        List<String> expected1 = Arrays.asList("255.255.11.135", "255.255.111.35");
        assertTrue(result1.containsAll(expected1) && expected1.containsAll(result1));

        // Test case 2: All zeros
        String s2 = "0000";
        List<String> result2 = solution.restoreIpAddresses(s2);
        List<String> expected2 = Arrays.asList("0.0.0.0");
        assertEquals(expected2, result2);

        // Test case 3: Complex case
        String s3 = "101023";
        List<String> result3 = solution.restoreIpAddresses(s3);
        List<String> expected3 = Arrays.asList("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3");
        assertTrue(result3.containsAll(expected3) && expected3.containsAll(result3));
    }
}
