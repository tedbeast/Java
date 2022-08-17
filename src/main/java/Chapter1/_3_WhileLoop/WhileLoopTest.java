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
    @Test
    public void whileLoopTest1(){
        int input = 3;
        int expected = 3;
        int actual = wl.whileExample(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void whileLoopTest2(){
        int input = 5;
        int expected = 10;
        int actual = wl.whileExample(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void whileLoopTest3(){
        int input = 6;
        int expected = 15;
        int actual = wl.whileExample(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void whileLoopTest4(){
        int input = 0;
        int expected = 0;
        int actual = wl.whileExample(input);
        Assert.assertEquals(expected, actual);
    }
}
