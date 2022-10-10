package Chapter6.Challenges.SecondHighest;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SecondHighestValueTest {
    public static SecondHighestValue shv;
    @BeforeClass
    public static void setUp(){
        shv = new SecondHighestValue();
    }
    @Test
    public void shvTest1(){
        int[] input = {0, 1, 2, 3, 4};
        int expected = 3;
        Assert.assertEquals(shv.getValue(input), expected);
    }
    @Test
    public void shvTest2(){
        int[] input = {0, 5, 2, 3, 4};
        int expected = 4;
        Assert.assertEquals(shv.getValue(input), expected);
    }
    @Test
    public void shvTest3(){
        int[] input = {0, 0, 1, 1, 2, 2, 3, 3};
        int expected = 2;
        Assert.assertEquals(shv.getValue(input), expected);
    }
}