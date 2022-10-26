package Chapter8._0_DataStructuresAndAlgorithms.Sort;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {
    Sort s = new Sort();

    /**
     * the sorted version of an already sorted array should be equivalent.
     */
    @Test
    public void sortTest1(){
        int[] input = {1,2,3,4,5};
        int[] expected = {1,2,3,4,5};
        int[] actual = s.sortArray(input);
        Assert.assertArrayEquals(expected,actual);
    }

    /**
     * The sorted version of {3,7,8,2,4} should be {2,3,4,7,8}.
     */
    @Test
    public void sortTest2(){
        int[] input = {3,7,8,2,4};
        int[] expected = {2,3,4,7,8};
        int[] actual = s.sortArray(input);
        Assert.assertArrayEquals(expected,actual);
    }

    /**
     * The sorted version of {9,6,7,4,8,0,2,1,3,5} should be {0,1,2,3,4,5,6,7,8,9}.
     */
    @Test
    public void sortTest3(){
        int[] input = {9,6,7,4,8,0,2,1,3,5};
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        int[] actual = s.sortArray(input);
        Assert.assertArrayEquals(expected,actual);
    }
}
