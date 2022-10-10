package Chapter4.Challenges.IsSorted;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class IsSortedTest {
    public static IsSorted is;
    @BeforeClass
    public static void setUp(){
        is = new IsSorted();
    }
    @Test
    public void isSortedTest1(){
        int[] input = {7, 5, 9, 0, 2};
        boolean expected = false;
        Assert.assertEquals(expected, is.checkSort(input));
    }
    @Test
    public void isSortedTest2(){
        int[] input = {1, 2, 3, 4, 5};
        boolean expected = true;
        Assert.assertEquals(expected, is.checkSort(input));
    }
    @Test
    public void isSortedTest3(){
        int[] input = {2, 4, 6, 7};
        boolean expected = true;
        Assert.assertEquals(expected, is.checkSort(input));
    }
}
