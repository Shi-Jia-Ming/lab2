import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class L2022212028_6_Test {

    @Test
    public void testPeopleIndexes() {
        Solution6 solution = new Solution6();

        // 示例 1
        List<List<String>> favoriteCompanies1 = Arrays.asList(
            Arrays.asList("leetcode", "google", "facebook"),
            Arrays.asList("google", "microsoft"),
            Arrays.asList("google", "facebook"),
            Arrays.asList("google"),
            Arrays.asList("amazon")
        );
        assertEquals(Arrays.asList(0, 1, 4), solution.peopleIndexes(favoriteCompanies1));

        // 示例 2
        List<List<String>> favoriteCompanies2 = Arrays.asList(
            Arrays.asList("leetcode", "google", "facebook"),
            Arrays.asList("leetcode", "amazon"),
            Arrays.asList("facebook", "google")
        );
        assertEquals(Arrays.asList(0, 1), solution.peopleIndexes(favoriteCompanies2));

        // 示例 3
        List<List<String>> favoriteCompanies3 = Arrays.asList(
            Arrays.asList("leetcode"),
            Arrays.asList("google"),
            Arrays.asList("facebook"),
            Arrays.asList("amazon")
        );
        assertEquals(Arrays.asList(0, 1, 2, 3), solution.peopleIndexes(favoriteCompanies3));
    }
}
