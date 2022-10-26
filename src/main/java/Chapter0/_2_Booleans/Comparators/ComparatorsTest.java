package Chapter0._2_Booleans.Comparators;

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

    /**
     * If isEqual is passed two numbers that are equal, isEqual should return true.
     */
    @Test
    public void isEqualTest1(){
        int a = 1;
        int b = 1;
        boolean expected = true;
        boolean actual = c.isEqual(a, b);
        Assert.assertEquals(expected, actual);
    }

    /**
     * If isEqual is passed two numbers that are not equal, isEqual should return false.
     */
    @Test
    public void isEqualTest2(){
        int a = 1;
        int b = 2;
        boolean expected = false;
        boolean actual = c.isEqual(a, b);
        Assert.assertEquals(expected, actual);
    }

    /**
     * If greaterThan is passed two numbers where a is greater than b, greaterThan should return true.
     */
    @Test
    public void greaterThanTest1(){
        int a = 2;
        int b = 1;
        boolean expected = true;
        boolean actual = c.greaterThan(a, b);
        Assert.assertEquals(expected, actual);
    }
    /**
     * If greaterThan is passed two numbers where a is less than b, greaterThan should return false.
     */
    @Test
    public void greaterThanTest2(){
        int a = 1;
        int b = 2;
        boolean expected = false;
        boolean actual = c.greaterThan(a, b);
        Assert.assertEquals(expected, actual);
    }

    /**
     * If greaterThan is passed two numbers where a is equal to b, greaterThan should return false.
     */
    @Test
    public void greaterThanTest3(){
        int a = 2;
        int b = 2;
        boolean expected = false;
        boolean actual = c.greaterThan(a, b);
        Assert.assertFalse(actual);
        Assert.assertEquals(expected, actual);
    }

    /**
     * If lessThan is passed two numbers where a is less than b, greaterThan should return true.
     */
    @Test
    public void lessThanTest1(){
        int a = 1;
        int b = 2;
        boolean expected = true;
        boolean actual = c.lessThan(a, b);
        Assert.assertEquals(expected, actual);
    }
    /**
     * If lessThan is passed two numbers where a is equal to b, greaterThan should return false.
     */
    @Test
    public void lessThanTest2(){
        int a = 2;
        int b = 2;
        boolean expected = false;
        boolean actual = c.lessThan(a, b);
        Assert.assertEquals(expected, actual);
    }
    /**
     * If lessThan is passed two numbers where a is greater than b, greaterThan should return false.
     */
    @Test
    public void lessThanTest3(){
        int a = 2;
        int b = 1;
        boolean expected = false;
        boolean actual = c.lessThan(a, b);
        Assert.assertEquals(expected, actual);
    }
    /**
     * If greaterThanOrEqualTo is passed two numbers where a is greater than b, then greaterThanOrEqualTo
     * should return true.
     */
    @Test
    public void greaterThanOrEqualToTest1(){
        int a = 2;
        int b = 1;
        boolean expected = true;
        boolean actual = c.greaterThanOrEqualTo(a, b);
        Assert.assertEquals(expected, actual);
    }
    /**
     * If greaterThanOrEqualTo is passed two numbers where a is equal to b, then greaterThanOrEqualTo
     * should return true.
     */
    @Test
    public void greaterThanOrEqualToTest2(){
        int a = 2;
        int b = 2;
        boolean expected = true;
        boolean actual = c.greaterThanOrEqualTo(a, b);
        Assert.assertEquals(expected, actual);
    }
    /**
     * If greaterThanOrEqualTo is passed two numbers where a is less than b, then greaterThanOrEqualTo
     * should return false.
     */
    @Test
    public void greaterThanOrEqualToTest3(){
        int a = 3;
        int b = 4;
        boolean expected = false;
        boolean actual = c.greaterThanOrEqualTo(a, b);
        Assert.assertEquals(expected, actual);
    }
    /**
     * If lessThanOrEqualTo is passed two numbers where a is less than b, then lessThanOrEqualTo
     * should return true.
     */
    @Test
    public void lessThanOrEqualToTest1(){
        int a = 1;
        int b = 2;
        boolean expected = true;
        boolean actual = c.lessThanOrEqualTo(a, b);
        Assert.assertEquals(expected, actual);
    }
    /**
     * If lessThanOrEqualTo is passed two numbers where a is equal to b, then lessThanOrEqualTo
     * should return true.
     */
    @Test
    public void lessThanOrEqualToTest2(){
        int a = 2;
        int b = 2;
        boolean expected = true;
        boolean actual = c.lessThanOrEqualTo(a, b);
        Assert.assertEquals(expected, actual);
    }
    /**
     * If lessThanOrEqualTo is passed two numbers where a is greater than b, then lessThanOrEqualTo
     * should return false.
     */
    @Test
    public void lessThanOrEqualToTest3(){
        int a = 4;
        int b = 2;
        boolean expected = false;
        boolean actual = c.lessThanOrEqualTo(a, b);
        Assert.assertEquals(expected, actual);
    }
}
