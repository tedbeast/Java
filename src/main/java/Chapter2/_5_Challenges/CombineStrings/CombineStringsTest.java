package Chapter2._5_Challenges.CombineStrings;

import org.junit.Assert;
import org.junit.Test;

public class CombineStringsTest {
    CombineStrings cs = new CombineStrings();
    @Test
    public void combineTest1(){
        String input1 = "abc";
        String input2 = "xyz";
        String expected = "abcxyz";
        String actual = cs.combine(input1, input2);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void combineTest2(){
        String input1 = "123";
        String input2 = "456";
        String expected = "123456";
        String actual = cs.combine(input1, input2);
        Assert.assertEquals(expected,actual);
    }
}
