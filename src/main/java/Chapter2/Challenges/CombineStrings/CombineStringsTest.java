package Chapter2.Challenges.CombineStrings;

import org.junit.Assert;
import org.junit.Test;

public class CombineStringsTest {
    CombineStrings cs = new CombineStrings();

    /**
     * The combination of strings abc and xyz should result in abcxyz.
     */
    @Test
    public void combineTest1(){
        String input1 = "abc";
        String input2 = "xyz";
        String expected = "abcxyz";
        String actual = cs.combine(input1, input2);
        Assert.assertEquals(expected,actual);
    }
    /**
     * The combination of strings 123 and 456 should result in 123456.
     */
    @Test
    public void combineTest2(){
        String input1 = "123";
        String input2 = "456";
        String expected = "123456";
        String actual = cs.combine(input1, input2);
        Assert.assertEquals(expected,actual);
    }
}
