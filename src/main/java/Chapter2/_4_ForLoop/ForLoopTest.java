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

    /**
     * Given a start point at 0 and end point at 3, the sum of 0+1+2 should result in an expected value of 3.
     */
    @Test
    public void forLoopTest1(){
        int inputStart = 0;
        int inputEnd = 3;
        int expected = 3;
        int actual = fl.forExample(inputStart, inputEnd);
        Assert.assertEquals(expected, actual);
    }
    /**
     * Given a start point at 5 and end point at 9, the sum of 2+3+4 should result in an expected value of 9.
     */
    @Test
    public void forLoopTest2(){
        int inputStart = 2;
        int inputEnd = 5;
        int expected = 9;
        int actual = fl.forExample(inputStart, inputEnd);
        Assert.assertEquals(expected, actual);
    }
    /**
     * Given a start point at 5 and end point at 20, the sum of 5+6+7+..+18+19 should result in an expected value of 180.
     */
    @Test
    public void forLoopTest3(){
        int inputStart = 5;
        int inputEnd = 20;
        int expected = 180;
        int actual = fl.forExample(inputStart, inputEnd);
        Assert.assertEquals(expected, actual);
    }
    /**
     * Given a start point at 0 and end point at 0, the sum should result in an expected value of 0.
     */
    @Test
    public void forLoopTest4(){
        int inputStart = 0;
        int inputEnd = 0;
        int expected = 0;
        int actual = fl.forExample(inputStart, inputEnd);
        Assert.assertEquals(expected, actual);
    }

}
