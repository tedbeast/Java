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

    /**
     * Given the input {2, 2, 3, 4, 5} and a target 4, there is a sum of 4 of 2+2.
     */
    @Test
    public void isThereSumTest1(){
        int[] input = {2, 2, 3, 4, 5};
        int target = 4;
        boolean expected = true;
        Assert.assertEquals(expected, its.check(input, target));
    }
    /**
     * Given the input {2, 2, 3, 4, 5} and a target 5, there is a sum of 4 of 2+3.
     */
    @Test
    public void isThereSumTest2(){
        int[] input = {2, 2, 3, 4, 5};
        int target = 5;
        boolean expected = true;
        Assert.assertEquals(expected, its.check(input, target));
    }
    /**
     * Given the input {2, 2, 3, 4, 5} and a target 11, there is no possible pair of numbers for a sum.
     */
    @Test
    public void isThereSumTest3(){
        int[] input = {2, 2, 3, 4, 5};
        int target = 11;
        boolean expected = false;
        Assert.assertEquals(expected, its.check(input, target));
    }
    /**
     * Given the input {2, 2, 3, 4, 5} and a target 10, there no possible pair of numbers for a sum because
     * the number 5 may not be added to itself.
     */
    @Test
    public void isThereSumTest4(){
        int[] input = {2, 2, 3, 4, 5};
        int target = 10;
        boolean expected = false;
        Assert.assertEquals(expected, its.check(input, target));
    }
}
