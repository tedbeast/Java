package Chapter4.Challenges.Average;

;
import org.junit.Assert;
import org.junit.Test;

public class AverageTest {
    Average a = new Average();
    @Test
    public void averageTest1(){
        int[] nums = {1, 3, 1, 3};
        double target = 2;
        double marginOfError = .1;
        Assert.assertEquals(target, a.getAvg(nums), marginOfError);
    }
    @Test
    public void averageTest2(){
        int[] nums = {1, 2};
        double target = 1.5;
        double marginOfError = .1;
        Assert.assertEquals(target, a.getAvg(nums), marginOfError);
    }
    @Test
    public void averageTest3(){
        int[] nums = {1, 2, 3};
        double target = 2;
        double marginOfError = .1;
        Assert.assertEquals(target, a.getAvg(nums), marginOfError);
    }
    @Test
    public void averageTest4(){
        int[] nums = {4, -4};
        double target = 0;
        double marginOfError = .1;
        Assert.assertEquals(target, a.getAvg(nums), marginOfError);
    }
}
