package Chapter5.Challenges.MaxMinusMin;

import org.junit.Assert;
import org.junit.Test;

public class MaxMinusMinTest {
    MaxMinusMin mmm = new MaxMinusMin();

    /**
     * given input {0,1,2,3,4,5,6} the max is 6 and the min is 0, so difference should return 6.
     */
    @Test
    public void maxMinTest1(){
        int[] input = {0,1,2,3,4,5,6};
        int expected = 6;
        int actual = mmm.difference(input);
        Assert.assertEquals(expected,actual);
    }
    /**
     * given input {2,4,8,16,32} the max is 32 and the min is 2, so difference should return 30.
     */
    @Test
    public void maxMinTest2(){
        int[] input = {2,4,8,16,32};
        int expected = 30;
        int actual = mmm.difference(input);
        Assert.assertEquals(expected,actual);
    }
    /**
     * given input {4,2,9,4,7} the max is 9 and the min is 2, so difference should return 7.
     */
    @Test
    public void maxMinTest3(){
        int[] input = {4,2,9,4,7};
        int expected = 7;
        int actual = mmm.difference(input);
        Assert.assertEquals(expected,actual);
    }
    /**
     * given input {1,1,1,1,1} the max is 1 and the min is 1, so difference should return 0.
     */
    @Test
    public void maxMinTest4(){
        int[] input = {1,1,1,1,1};
        int expected = 0;
        int actual = mmm.difference(input);
        Assert.assertEquals(expected,actual);
    }
}
