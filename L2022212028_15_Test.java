import org.junit.Test;
import static org.junit.Assert.*;

public class L2022212028_15_Test {

    @Test
    public void testCompareVersion() {
        Solution solution = new Solution();

        // Test case 1: Same versions with leading zeros
        String version1 = "1.01";
        String version2 = "1.001";
        assertEquals(0, solution.compareVersion(version1, version2));

        // Test case 2: One version has extra zeros
        String version3 = "1.0";
        String version4 = "1.0.0";
        assertEquals(0, solution.compareVersion(version3, version4));

        // Test case 3: Version1 < Version2
        String version5 = "0.1";
        String version6 = "1.1";
        assertEquals(-1, solution.compareVersion(version5, version6));

        // Test case 4: Version1 > Version2
        String version7 = "1.2";
        String version8 = "1.1";
        assertEquals(1, solution.compareVersion(version7, version8));

        // Test case 5: Different lengths
        String version9 = "1.0.1";
        String version10 = "1";
        assertEquals(1, solution.compareVersion(version9, version10));
    }
}
