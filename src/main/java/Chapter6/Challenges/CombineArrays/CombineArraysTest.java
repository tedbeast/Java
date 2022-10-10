package Chapter6.Challenges.CombineArrays;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CombineArraysTest {
    public static CombineArrays ca;
    @BeforeClass
    public static void setUp(){
        ca = new CombineArrays();
    }
    @Test
    public void combineArraysTest1(){
        int[] input1 = {0,1,2};
        int[] input2 = {3,4,5};
        int[] expected = {0,1,2,3,4,5};
        Assert.assertArrayEquals(expected, ca.combine(input1, input2));
    }
    @Test
    public void combineArraysTest2(){
        int[] input1 = {9,3,5};
        int[] input2 = {4,0,1};
        int[] expected = {9,3,5,4,0,1};
        Assert.assertArrayEquals(expected, ca.combine(input1, input2));
    }
}
