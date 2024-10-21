import org.junit.Test;
import static org.junit.Assert.*;

public class L2022212028_10_Test {

    @Test
    public void testFractionAddition() {
        Solution10 solution = new Solution10();

        // Test case 1: -1/2 + 1/2 = 0/1
        String expression1 = "-1/2+1/2";
        assertEquals("0/1", solution.fractionAddition(expression1));

        // Test case 2: -1/2 + 1/2 + 1/3 = 1/3
        String expression2 = "-1/2+1/2+1/3";
        assertEquals("1/3", solution.fractionAddition(expression2));

        // Test case 3: 1/3 - 1/2 = -1/6
        String expression3 = "1/3-1/2";
        assertEquals("-1/6", solution.fractionAddition(expression3));

        // Test case 4: Complex expression
        String expression4 = "5/3+1/3-2/3";
        assertEquals("4/3", solution.fractionAddition(expression4));

        // Test case 5: Positive fraction only
        String expression5 = "1/2+1/2";
        assertEquals("1/1", solution.fractionAddition(expression5));

        // Test case 6: Mixed positive and negative fractions
        String expression6 = "-1/4+3/4";
        assertEquals("1/2", solution.fractionAddition(expression6));
    }
}
