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

    /**
     * If we have an array of size 5, getLengthOfArray should return 5.
     */
    @Test
    public void getLengthTest1(){
        int[] input = {0,1,2,3,4};
        int expected = 5;
        int actual = ab.getLengthOfArray(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * If we have an array of size 3, getLengthOfArray should return 3.
     */
    @Test
    public void getLengthTest2(){
        int[] input = {8,4,7};
        int expected = 3;
        int actual = ab.getLengthOfArray(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * If we have an array predefined as {8,4,7,3,8,5}, attempting to get the item at index 2 should return 7.
     */
    @Test
    public void getNthElementOfArrayTest1(){
        int[] input = {8,4,7,3,8,5};
        int n = 2;
        int expected = 7;
        int actual = ab.getNthElementOfArray(input, n);
        Assert.assertEquals(expected, actual);
    }

    /**
     * If we have an array predefined as {5,3,9,1,0}, attempting to get the item at index 0 should return 5.
     */
    @Test
    public void getNthElementOfArrayTest2(){
        int[] input = {5,3,9,1,0};
        int n = 0;
        int expected = 5;
        int actual = ab.getNthElementOfArray(input, n);
        Assert.assertEquals(expected, actual);
    }
    /**
     * If we have an array predefined as {6,4,8}, attempting to get the item at index 2 should return 8.
     */
    @Test
    public void getNthElementOfArrayTest3(){
        int[] input = {6,4,8};
        int n = 2;
        int expected = 8;
        int actual = ab.getNthElementOfArray(input, n);
        Assert.assertEquals(expected, actual);
    }

    /**
     * If we have an array predefined as {9,3,7,3,6}, attempting to change the value at index 2 to 5 should result in
     * an array {9,3,5,3,6}, where the value at index 2 is 5.
     */
    @Test
    public void setNthElementOfArrayTest1(){
        int[] input = {9,3,7,3,6};
        int n = 2;
        int val = 5;
        ab.setNthElementOfArray(input, n, val);
        Assert.assertEquals(input[n], val);
    }

    /**
     * If we have an array predefined as {9,3,4}, attempting to change the value at index 0 to 2 should result in
     * an array {2,3,4}, where the value at index 0 is 2.
     */
    @Test
    public void setNthElementOfArrayTest2(){
        int[] input = {9,3,4};
        int n = 0;
        int val = 2;
        ab.setNthElementOfArray(input, n, val);
        Assert.assertEquals(input[n], val);
    }

    /**
     * returnNewArraySizeN(5) should return a new array of size 5.
     */
    @Test
    public void returnNewArraySizeNTest1(){
        int input = 5;
        int[] output = ab.returnNewArraySizeN(input);
        Assert.assertEquals(output.length, input);
    }
    /**
     * returnNewArraySizeN(2) should return a new array of size 2.
     */
    @Test
    public void returnNewArraySizeNTest2(){
        int input = 2;
        int[] output = ab.returnNewArraySizeN(input);
        Assert.assertEquals(output.length, input);
    }
}
