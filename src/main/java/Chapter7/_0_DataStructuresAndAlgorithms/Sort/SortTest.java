package Chapter7._0_DataStructuresAndAlgorithms.Sort;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {
    Sort s = new Sort();
    @Test
    public void sortTest1(){
        int[] input = {1,2,3,4,5};
        int[] expected = {1,2,3,4,5};
        int[] actual = s.sortArray(input);
        Assert.assertArrayEquals(expected,actual);
    }
    @Test
    public void sortTest2(){
        int[] input = {3,7,8,2,4};
        int[] expected = {2,3,4,7,8};
        int[] actual = s.sortArray(input);
        Assert.assertArrayEquals(expected,actual);
    }
    @Test
    public void sortTest3(){
        int[] input = {9,6,7,4,8,0,2,1,3,5};
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        int[] actual = s.sortArray(input);
        Assert.assertArrayEquals(expected,actual);
    }
}
