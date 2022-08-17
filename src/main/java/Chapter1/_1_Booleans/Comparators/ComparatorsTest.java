package Chapter1._1_Booleans.Comparators;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ComparatorsTest {
    static Comparators c;
    @BeforeClass
    public static void setUp(){
        c = new Comparators();
    }
    @Test
    public void isEqualTest1(){
        int input1 = 1;
        int input2 = 1;
        boolean actual = c.isEqual(input1, input2);
        Assert.assertTrue(actual);
    }
    @Test
    public void isEqualTest2(){
        int input1 = 1;
        int input2 = 2;
        boolean actual = c.isEqual(input1, input2);
        Assert.assertFalse(actual);
    }
    @Test
    public void greaterThanTest1(){
        int input1 = 2;
        int input2 = 1;
        boolean actual = c.greaterThan(input1, input2);
        Assert.assertTrue(actual);
    }
    @Test
    public void greaterThanTest2(){
        int input1 = 1;
        int input2 = 2;
        boolean actual = c.greaterThan(input1, input2);
        Assert.assertFalse(actual);
    }

    @Test
    public void greaterThanTest3(){
        int input1 = 2;
        int input2 = 2;
        boolean actual = c.greaterThan(input1, input2);
        Assert.assertFalse(actual);
    }
    @Test
    public void lessThanTest1(){
        int input1 = 1;
        int input2 = 2;
        boolean actual = c.lessThan(input1, input2);
        Assert.assertTrue(actual);
    }
    @Test
    public void lessThanTest2(){
        int input1 = 2;
        int input2 = 2;
        boolean actual = c.lessThan(input1, input2);
        Assert.assertFalse(actual);
    }
    @Test
    public void lessThanTest3(){
        int input1 = 2;
        int input2 = 1;
        boolean actual = c.lessThan(input1, input2);
        Assert.assertFalse(actual);
    }
    @Test
    public void greaterThanOrEqualToTest1(){
        int input1 = 2;
        int input2 = 1;
        boolean actual = c.greaterThanOrEqualTo(input1, input2);
        Assert.assertTrue(actual);
    }
    @Test
    public void greaterThanOrEqualToTest2(){
        int input1 = 2;
        int input2 = 2;
        boolean actual = c.greaterThanOrEqualTo(input1, input2);
        Assert.assertTrue(actual);
    }
    @Test
    public void greaterThanOrEqualToTest3(){
        int input1 = 3;
        int input2 = 4;
        boolean actual = c.greaterThanOrEqualTo(input1, input2);
        Assert.assertFalse(actual);
    }
    @Test
    public void lessThanOrEqualToTest1(){
        int input1 = 1;
        int input2 = 2;
        boolean actual = c.lessThanOrEqualTo(input1, input2);
        Assert.assertTrue(actual);
    }
    @Test
    public void lessThanOrEqualToTest2(){
        int input1 = 2;
        int input2 = 2;
        boolean actual = c.lessThanOrEqualTo(input1, input2);
        Assert.assertTrue(actual);
    }
    @Test
    public void lessThanOrEqualToTest3(){
        int input1 = 4;
        int input2 = 2;
        boolean actual = c.lessThanOrEqualTo(input1, input2);
        Assert.assertFalse(actual);
    }
}
