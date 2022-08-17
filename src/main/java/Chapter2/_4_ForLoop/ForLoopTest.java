package Chapter2._4_ForLoop;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ForLoopTest {
    static ForLoop fl;
    @BeforeClass
    public static void setUp(){
        fl = new ForLoop();
    }
    @Test
    public void forLoopTest1(){
        int inputStart = 0;
        int inputEnd = 3;
        int expected = 3;
        int actual = fl.forExample(inputStart, inputEnd);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void forLoopTest2(){
        int inputStart = 2;
        int inputEnd = 5;
        int expected = 9;
        int actual = fl.forExample(inputStart, inputEnd);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void forLoopTest3(){
        int inputStart = 5;
        int inputEnd = 20;
        int expected = 180;
        int actual = fl.forExample(inputStart, inputEnd);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void forLoopTest4(){
        int inputStart = 0;
        int inputEnd = 0;
        int expected = 0;
        int actual = fl.forExample(inputStart, inputEnd);
        Assert.assertEquals(expected, actual);
    }

}
