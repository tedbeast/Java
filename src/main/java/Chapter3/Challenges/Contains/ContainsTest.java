package Chapter3.Challenges.Contains;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ContainsTest {
    static Contains c;
    @BeforeClass
    public static void setUp(){
        c = new Contains();
    }

    /**
     * Given an array {0,1,2,3,4} and a value 5, arrayContains should return false because the array does not contain
     * the value.
     */
    @Test
    public void containsTest1(){
        int[] input = {0,1,2,3,4};
        int target = 5;
        boolean expected = false;
        Assert.assertEquals(expected, c.arrayContains(input, target));
    }
    /**
     * Given an array {0,1,2,3,4} and a value 5, arrayContains should return true because the array contains
     * the value.
     */
    @Test
    public void containTest2(){
        int[] input = {0,1,2,3,4};
        int target = 4;
        boolean expected = true;
        Assert.assertEquals(expected, c.arrayContains(input, target));
    }
    /**
     * Given an array {8,7,3,6} and a value 5, arrayContains should return false because the array does not contain
     * the value.
     */
    @Test
    public void containTest3(){
        int[] input = {8,7,3,6};
        int target = 5;
        boolean expected = false;
        Assert.assertEquals(expected, c.arrayContains(input, target));
    }
    /**
     * Given an array {9,7,7,3} and a value 7, arrayContains should return true because the array contains
     * the value.
     */
    @Test
    public void containTest4(){
        int[] input = {9,7,7,3};
        int target = 7;
        boolean expected = true;
        Assert.assertEquals(expected, c.arrayContains(input, target));
    }

}
