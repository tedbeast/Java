package Chapter3.Challenges.Return1ToN;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReturnString1ToNTest {
    static ReturnString1ToN rs1tn;
    @BeforeClass
    public static void setUp(){
        rs1tn = new ReturnString1ToN();
    }

    /**
     * Given input 5, returnNumber should return 1 2 3 4 5.
     */
    @Test
    public void returnStringTest1(){
        int input = 5;
        String expected = "1 2 3 4 5";
        String actual = rs1tn.returnNumber(input).trim();
        Assert.assertEquals(expected,actual);
    }
    /**
     * Given input 3, returnNumber should return 1 2 3.
     */
    @Test
    public void returnStringTest2(){
        int input = 3;
        String expected = "1 2 3";
        String actual = rs1tn.returnNumber(input).trim();
        Assert.assertEquals(expected,actual);
    }
}
