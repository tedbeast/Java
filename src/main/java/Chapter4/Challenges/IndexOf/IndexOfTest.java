package Chapter4.Challenges.IndexOf;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class IndexOfTest {
    public static IndexOf io;
    @BeforeClass
    public static void setUp(){
        io = new IndexOf();
    }
    @Test
    public void indexTest1(){
        int[] input = {0, 1, 2, 7, 4};
        int target = 7;
        int expected = 3;
        Assert.assertEquals(expected, io.getIndex(input, target));
    }

    @Test
    public void indexTest2(){
        int[] input = {9, 5, 8, 7, 1};
        int target = 9;
        int expected = 0;
        Assert.assertEquals(expected, io.getIndex(input, target));
    }

    @Test
    public void indexTest3(){
        int[] input = {9, 5, 8, 7, 1};
        int target = 3;
        int expected = -1;
        Assert.assertEquals(expected, io.getIndex(input, target));
    }
}
