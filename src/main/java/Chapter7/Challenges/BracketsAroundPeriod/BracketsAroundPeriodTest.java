package Chapter7.Challenges.BracketsAroundPeriod;

import org.junit.Assert;
import org.junit.Test;

public class BracketsAroundPeriodTest {
    BracketsAroundPeriod bap = new BracketsAroundPeriod();
    @Test
    public void bracketsTest1(){
        String input = "3.14";
        String expected = "3[.]14";
        String actual = bap.placeBrackets(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void bracketsTest2(){
        String input = "9.8";
        String expected = "9[.]8";
        String actual = bap.placeBrackets(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void bracketsTest3(){
        String input = "123.456.789";
        String expected = "123[.]456[.]789";
        String actual = bap.placeBrackets(input);
        Assert.assertEquals(expected, actual);
    }
}
