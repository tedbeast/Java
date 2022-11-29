package Chapter1._3_WhileLoop;


;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class WhileLoopTest {
    static WhileLoop wl;
    @BeforeClass
    public static void setUp(){
        wl = new WhileLoop();
    }

    /**
     * A while loop summing all numbers between 0 and 3 exclusive should result in an expected value of 3.
     * 0+1+2 = 3
     */
    @Test
    public void whileLoopTest1(){
        int input = 3;
        int expected = 3;
        int actual = wl.whileExample(input);
        Assert.assertEquals(expected, actual);
    }
    /**
     * A while loop summing all numbers between 0 and 5 exclusive should result in an expected value of 10.
     * 0+1+2+3+4 = 10
     */
    @Test
    public void whileLoopTest2(){
        int input = 5;
        int expected = 10;
        int actual = wl.whileExample(input);
        Assert.assertEquals(expected, actual);
    }
    /**
     * A while loop summing all numbers between 0 and 6 exclusive should result in an expected value of 3.
     * 0+1+2+3+4+5 = 15
     */
    @Test
    public void whileLoopTest3(){
        int input = 6;
        int expected = 15;
        int actual = wl.whileExample(input);
        Assert.assertEquals(expected, actual);
    }
    /**
     * A while loop summing all numbers between 0 and 0 exclusive should result in an expected value of 0.
     */
    @Test
    public void whileLoopTest4(){
        int input = 0;
        int expected = 0;
        int actual = wl.whileExample(input);
        Assert.assertEquals(expected, actual);
    }
}
