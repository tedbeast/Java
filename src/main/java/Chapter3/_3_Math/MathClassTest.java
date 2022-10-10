package Chapter3._3_Math;

import org.junit.Assert;
import org.junit.Test;

public class MathClassTest {
    MathClass mc = new MathClass();

    /**
     * MathPow should return 4 with inputs 2 and 2 because 2^2 = 4.
     */
    @Test
    public void mathClassTest1(){
        double inputA = 2;
        double inputB = 2;
        double expected = 4;
        double actual = mc.mathPow(inputA, inputB);
        Assert.assertEquals(expected, actual, .01);
    }

    /**
     * MathPow should return 81 with inputs 3 and 4 because 3^4 = 81.
     */
    @Test
    public void mathClassTest2(){
        double inputA = 3;
        double inputB = 4;
        double expected = 81;
        double actual = mc.mathPow(inputA, inputB);
        Assert.assertEquals(expected, actual, .01);
    }
}
