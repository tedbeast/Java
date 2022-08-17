package Chapter4._0_OOP.Casting.CastingPrimitive;

import org.junit.Assert;
import org.junit.Test;

public class CastingPrimitiveTest {
    CastingPrimitive cp = new CastingPrimitive();
    @Test
    public void castTest1(){
        double input = 4.3;
        int expected = 4;
        int actual = cp.castToInt(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void castTest2(){
        double input = 9.999;
        int expected = 9;
        int actual = cp.castToInt(input);
        Assert.assertEquals(expected, actual);
    }
}
