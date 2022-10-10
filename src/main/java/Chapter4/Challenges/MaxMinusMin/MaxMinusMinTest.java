package Chapter4.Challenges.MaxMinusMin;

import org.junit.Assert;
import org.junit.Test;

public class MaxMinusMinTest {
    MaxMinusMin mmm = new MaxMinusMin();
    @Test
    public void maxMinTest1(){
        int[] input = {0,1,2,3,4,5,6};
        int expected = 6;
        int actual = mmm.difference(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void maxMinTest2(){
        int[] input = {2,4,8,16,32};
        int expected = 30;
        int actual = mmm.difference(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void maxMinTest3(){
        int[] input = {4,2,9,4,7};
        int expected = 7;
        int actual = mmm.difference(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void maxMinTest4(){
        int[] input = {1,1,1,1,1};
        int expected = 0;
        int actual = mmm.difference(input);
        Assert.assertEquals(expected,actual);
    }
}
