package Chapter1._2_IfStatement;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class IfStatementTest {
    static IfStatement is;
    @BeforeClass
    public static void setUp(){
        is = new IfStatement();
    }
    @Test
    public void ifStatementTest1(){
        boolean inputBool = true;
        int inputA = 0;
        int inputB = 1;
        int expected = 0;
        int actual = is.ifExample(inputBool, inputA, inputB);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void ifStatementTest2(){
        boolean inputBool = false;
        int inputA = 0;
        int inputB = 1;
        int expected = 1;
        int actual = is.ifExample(inputBool, inputA, inputB);
        Assert.assertEquals(expected, actual);
    }
}
