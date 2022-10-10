package Chapter7.Challenges.Rotate;

;
import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {
    RotateArray ra = new RotateArray();
    @Test
    public void rotateArrayTest1(){
        int[] nums = {0, 1, 2, 3};
        int inc = 1;
        int[] target = {3, 0, 1, 2};
        Assert.assertArrayEquals(target, ra.rotate(nums, inc));
    }
    @Test
    public void rotateArrayTest2(){
        int[] nums = {0, 1, 2, 3};
        int inc = 2;
        int[] target = {2, 3, 0, 1};
        Assert.assertArrayEquals(target, ra.rotate(nums, inc));
    }
    @Test
    public void rotateArrayTest3(){
        int[] nums = {0, 2, 4, 6, 8};
        int inc = 0;
        int[] target = {0, 2, 4, 6, 8};
        Assert.assertArrayEquals(target, ra.rotate(nums, inc));
    }
}
