package Chapter3.Challenges.ArraySum;

import org.junit.Assert;
import org.junit.Test;

public class ArraySumTest {
    ArraySum as = new ArraySum();

    /**
     * the sum of {1, 3, 5, 6} should return the sum of the values, 15.
     */
    @Test
    public void testSum1(){
        int[] nums = {1, 3, 5, 6};
        int target = 15;
        Assert.assertEquals(target, as.sum(nums));
    }
    /**
     * the sum of {1, 2, 3, 1} should return the sum of the values, 7.
     */
    @Test
    public void testSum2(){
        int[] nums = {1, 2, 3, 1};
        int target = 7;
        Assert.assertEquals(target, as.sum(nums));
    }

    /**
     * the sum of {0, 0, 0} should return the sum of the values, 0.
     */
    @Test
    public void testSumZeroes(){
        int[] nums = {0, 0, 0};
        int target = 0;
        Assert.assertEquals(target, as.sum(nums));
    }
}
