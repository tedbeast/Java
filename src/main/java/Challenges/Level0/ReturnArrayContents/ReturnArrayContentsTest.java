package Challenges.Level0.ReturnArrayContents;

import org.junit.Assert;
import org.junit.Test;

public class ReturnArrayContentsTest {
    ReturnArrayContents rac = new ReturnArrayContents();
    @Test
    public void arrayStringTest1(){
        int[] input = {1,2,3,4,5};
        String expected = "1, 2, 3, 4, 5";
        String actual = rac.arrayToString().trim();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void arrayStringTest2(){
        int[] input = {9,8,7};
        String expected = "9, 8, 7";
        String actual = rac.arrayToString().trim();
        Assert.assertEquals(expected, actual);
    }
}
