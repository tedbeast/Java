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
    @Test
    public void MissingValueTest1(){
        int[] input = {1,3,4,5};
        int expected = 2;
        Assert.assertEquals(expected, mv.getMissingValue(input));
    }
    @Test
    public void MissingValueTest2(){
        int[] input = {4,5,6,7,9};
        int expected = 8;
        Assert.assertEquals(expected, mv.getMissingValue(input));
    }
    @Test
    public void MissingValueTest3(){
        int[] input = {2,3,4,5};
        int expected = -1;
        Assert.assertEquals(expected, mv.getMissingValue(input));
    }

}
