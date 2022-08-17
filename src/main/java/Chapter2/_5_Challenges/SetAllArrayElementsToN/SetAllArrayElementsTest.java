package Chapter2._5_Challenges.SetAllArrayElementsToN;

import org.junit.Assert;
import org.junit.Test;

public class SetAllArrayElementsTest {
    public SetAllArrayElements saae = new SetAllArrayElements();
    @Test
    public void setTest1(){
        int[] input = {1,2,3,4};
        int n = 0;
        int[] expected = {0,0,0,0};
        int[] actual = saae.set(input,n);
        Assert.assertArrayEquals(expected,actual);
    }
    @Test
    public void setTest2(){
        int[] input = {2,2,2,2,2};
        int n = 1;
        int[] expected = {1,1,1,1,1};
        int[] actual = saae.set(input,n);
        Assert.assertArrayEquals(expected,actual);
    }
}
