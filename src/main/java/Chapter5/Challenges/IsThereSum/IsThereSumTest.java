package Chapter5.Challenges.IsThereSum;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class IsThereSumTest {
    public static IsThereSum its;
    @BeforeClass
    public static void setUp(){
        its = new IsThereSum();
    }
    @Test
    public void isThereSumTest1(){
        int[] input = {2, 2, 3, 4, 5};
        int target = 4;
        boolean expected = true;
        Assert.assertEquals(expected, its.check(input, target));
    }
    @Test
    public void isThereSumTest2(){
        int[] input = {2, 2, 3, 4, 5};
        int target = 5;
        boolean expected = true;
        Assert.assertEquals(expected, its.check(input, target));
    }
    @Test
    public void isThereSumTest3(){
        int[] input = {2, 2, 3, 4, 5};
        int target = 11;
        boolean expected = false;
        Assert.assertEquals(expected, its.check(input, target));
    }
    @Test
    public void isThereSumTest4(){
        int[] input = {2, 2, 3, 4, 5};
        int target = 10;
        boolean expected = false;
        Assert.assertEquals(expected, its.check(input, target));
    }
}
