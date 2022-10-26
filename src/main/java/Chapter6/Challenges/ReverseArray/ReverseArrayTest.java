package Chapter6.Challenges.ReverseArray;

;
import org.junit.Assert;
import org.junit.Test;

public class ReverseArrayTest {
    ReverseArray ra = new ReverseArray();

    /**
     * The reverse of {1, 2, 3, 4} is {4, 3, 2, 1}.
     */
    @Test
    public void ReverseArrayTest(){
        int[] nums = {1, 2, 3, 4};
        int[] target = {4, 3, 2, 1};
        Assert.assertArrayEquals(target, ra.reverse(nums));
    }

    /**
     * The reverse of {6, 4, 3, 0} is {0, 3, 4, 6}.
     */
    @Test
    public void ReverseArrayTest2(){
        int[] nums = {6, 4, 3, 0};
        int[] target = {0, 3, 4, 6};
        Assert.assertArrayEquals(target, ra.reverse(nums));
    }
}
