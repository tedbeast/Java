package Chapter2._2_Arrays;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
;

public class ArrayBasicsTest {
    static ArrayBasics ab;
    @BeforeClass
    public static void setUp(){
        ab = new ArrayBasics();
    }
    @Test
    public void getLengthTest1(){
        int[] input = {0,1,2,3,4};
        int expected = 5;
        int actual = ab.getLengthOfArray(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getLengthTest2(){
        int[] input = {8,4,7};
        int expected = 3;
        int actual = ab.getLengthOfArray(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getNthElementOfArrayTest1(){
        int[] input = {8,4,7,3,8,5};
        int n = 2;
        int expected = 7;
        int actual = ab.getNthElementOfArray(input, n);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getNthElementOfArrayTest2(){
        int[] input = {5,3,9,1,0};
        int n = 0;
        int expected = 5;
        int actual = ab.getNthElementOfArray(input, n);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getNthElementOfArrayTest3(){
        int[] input = {6,4,8};
        int n = 2;
        int expected = 8;
        int actual = ab.getNthElementOfArray(input, n);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setNthElementOfArrayTest1(){
        int[] input = {9,3,7,3,6};
        int n = 2;
        int val = 5;
        int[] output = ab.setNthElementOfArray(input, n, val);
        Assert.assertEquals(output[n], val);
    }
    @Test
    public void setNthElementOfArrayTest2(){
        int[] input = {9,3,4};
        int n = 0;
        int val = 2;
        int[] output = ab.setNthElementOfArray(input, n, val);
        Assert.assertEquals(output[n], val);
    }
    @Test
    public void returnNewArraySizeNTest1(){
        int input = 5;
        int[] output = ab.returnNewArraySizeN(input);
        Assert.assertEquals(output.length, input);
    }
    @Test
    public void returnNewArraySizeNTest2(){
        int input = 2;
        int[] output = ab.returnNewArraySizeN(input);
        Assert.assertEquals(output.length, input);
    }
}
