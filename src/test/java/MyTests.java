import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyTests {

    @Test
    public void testRollDie() {
        boolean[] found = new boolean[20]; //extra room just in case...
        for (int i = 0; i < 10000; i++) {
            int x = MyMain.rollDie();
            found[x] = true;
        }

        for (int i = 1; i <= 6; i++) {
            assertTrue(found[i], "The tester rolled 10000 dice using your rollDie() method, but it never rolled a: " + (i));
        }
    }

    @Test
    public void testSumOfTwoDice() {
        int[] rolls = MyMain.sumOfTwoDice(100000);
        double[] percentages = new double[rolls.length];
        for (int i = 0; i < rolls.length; i++) {
            percentages[i] = (double) rolls[i]/100000 * 100;
        }

        assertEquals(2.78, percentages[0], 1, "The % of rolls where sum == 2 should be around: " + "2.78%");
        assertEquals(5.56, percentages[1], 1, "The % of rolls where sum == 3 should be around: " + "5.56%");
        assertEquals(8.33, percentages[2], 1, "The % of rolls where sum == 4 should be around: " + "8.33%");
        assertEquals(11.11, percentages[3], 1, "The % of rolls where sum == 5 should be around: " + "11.11%");
        assertEquals(13.89, percentages[4], 1, "The % of rolls where sum == 6 should be around: " + "13.89%");
        assertEquals(16.67, percentages[5], 1, "The % of rolls where sum == 7 should be around: " + "16.67%");
    }
}
