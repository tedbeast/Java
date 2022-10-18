package Chapter3.Challenges.Average;

;
import org.junit.Assert;
import org.junit.Test;

public class AverageTest {
    Average a = new Average();

    /**
     * the average of {1, 3, 1, 3} should be 2.
     */
    @Test
    public void averageTest1(){
        int[] nums = {1, 3, 1, 3};
        double target = 2;
        double marginOfError = .1;
        Assert.assertEquals(target, a.getAvg(nums), marginOfError);
    }
    /**
     * the average of {1, 2} should be 1.5.
     */
    @Test
    public void averageTest2(){
        int[] nums = {1, 2};
        double target = 1.5;
        double marginOfError = .1;
        Assert.assertEquals(target, a.getAvg(nums), marginOfError);
    }
    /**
     * the average of {1, 2, 3} should be 2.
     */
    @Test
    public void averageTest3(){
        int[] nums = {1, 2, 3};
        double target = 2;
        double marginOfError = .1;
        Assert.assertEquals(target, a.getAvg(nums), marginOfError);
    }
    /**
     * the average of {4, -4} should be 0.
     */
    @Test
    public void averageTest4(){
        int[] nums = {4, -4};
        double target = 0;
        double marginOfError = .1;
        Assert.assertEquals(target, a.getAvg(nums), marginOfError);
    }
}
