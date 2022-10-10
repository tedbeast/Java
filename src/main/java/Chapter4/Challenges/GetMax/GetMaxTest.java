package Chapter4.Challenges.GetMax;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class GetMaxTest {
    public static GetMax gm;
    @BeforeClass
    public static void setUp(){
        gm = new GetMax();
    }
    @Test
    public void getMaxTest1(){
        int[] input = {0,1,2,3,4};
        int expected = 4;
        Assert.assertEquals(expected, gm.max(input));
    }
    @Test
    public void getMaxTest2(){
        int[] input = {9,8,10,3,4};
        int expected = 10;
        Assert.assertEquals(expected, gm.max(input));
    }
    @Test
    public void getMaxTest3(){
        int[] input = {-100, -383, -45, -901, -76};
        int expected = -45;
        Assert.assertEquals(expected, gm.max(input));
    }
}
