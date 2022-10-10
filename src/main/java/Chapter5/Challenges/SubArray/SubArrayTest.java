package Chapter5.Challenges.SubArray;

import org.junit.Assert;
import org.junit.Test;

public class SubArrayTest {
    SubArray sa = new SubArray();
    @Test
    public void subTest1(){
        int[] input = {0,1,2,3,4,5};
        int inputStart = 0;
        int inputEnd = 4;
        int[] expected = {0,1,2,3};
        int[] actual = sa.sub(input, inputStart, inputEnd);
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void subTest2(){
        int[] input = {0,1,2,3,4,5};
        int inputStart = 2;
        int inputEnd = 6;
        int[] expected = {2,3,4,5};
        int[] actual = sa.sub(input, inputStart, inputEnd);
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void subTest3(){
        int[] input = {2,4,8,16,32,64,128,256,512,1024};
        int inputStart = 1;
        int inputEnd = 3;
        int[] expected = {4,8};
        int[] actual = sa.sub(input, inputStart, inputEnd);
        Assert.assertArrayEquals(expected, actual);
    }
}
