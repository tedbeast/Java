package Chapter5.Challenges.LargestSum;

;
import org.junit.Assert;
import org.junit.Test;

public class LargestSumTest {
    LargestSum ls = new LargestSum();

    /**
     * Given the array {0, 1, 2, 3, 4}, the largest sum is 7 (3+4).
     */
    @Test
    public void sumTest1(){
        int[] nums = {0, 1, 2, 3, 4};
        int target = 7;
        Assert.assertEquals(target, ls.bigSum(nums));
    }
    /**
     * Given the array {0, 0, 0, 0, 0}, the largest sum is 0 (0+0).
     */
    @Test
    public void sumTest2(){
        int[] nums = {0, 0, 0, 0, 0};
        int target = 0;
        Assert.assertEquals(target, ls.bigSum(nums));
    }
    /**
     * Given the array {0, 4, 2, 5, 0}, the largest sum is 9 (4+5).
     */
    @Test
    public void sumTest3(){
        int[] nums = {0, 4, 2, 5, 0};
        int target = 9;
        Assert.assertEquals(target, ls.bigSum(nums));
    }
    /**
     * Given the array {5, 4, 2, 5, 0}, the largest sum is 10 (5+5).
     */
    @Test
    public void sumTest4(){
        int[] nums = {5, 4, 2, 5, 0};
        int target = 10;
        Assert.assertEquals(target, ls.bigSum(nums));
    }
}
