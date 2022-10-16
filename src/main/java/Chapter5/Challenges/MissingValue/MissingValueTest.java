package Chapter5.Challenges.MissingValue;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MissingValueTest {
    public static MissingValue mv;
    @BeforeClass
    public static void setUp(){
        mv = new MissingValue();
    }

    /**
     * The array {1,3,4,5} is missing the number 2.
     */
    @Test
    public void MissingValueTest1(){
        int[] input = {1,3,4,5};
        int expected = 2;
        Assert.assertEquals(expected, mv.getMissingValue(input));
    }

    /**
     * The array {4,5,6,7,9} is missing the number 8.
     */
    @Test
    public void MissingValueTest2(){
        int[] input = {4,5,6,7,9};
        int expected = 8;
        Assert.assertEquals(expected, mv.getMissingValue(input));
    }
    /**
     * The array {2,3,4,5} is not missing any numbers, so we may return -1.
     */
    @Test
    public void MissingValueTest3(){
        int[] input = {2,3,4,5};
        int expected = -1;
        Assert.assertEquals(expected, mv.getMissingValue(input));
    }

}
