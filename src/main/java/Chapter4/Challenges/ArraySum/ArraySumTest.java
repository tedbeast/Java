package Chapter4.Challenges.ArraySum;

;
import org.junit.Assert;
import org.junit.Test;

public class ArraySumTest {
    ArraySum as = new ArraySum();
    @Test
    public void testSumTrue(){
        int[] nums = {1, 3, 5, 6};
        int target = 15;
        Assert.assertEquals(target, as.sum(nums));
    }
    @Test
    public void testSumFalse(){
        int[] nums = {1, 3, 5, 6};
        int target = 14;
        Assert.assertNotEquals(target, as.sum(nums));
    }
    @Test
    public void testSumZeroes(){
        int[] nums = {0, 0, 0};
        int target = 0;
        Assert.assertEquals(target, as.sum(nums));
    }
}
