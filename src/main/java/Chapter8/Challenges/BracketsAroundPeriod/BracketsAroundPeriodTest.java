package Chapter8.Challenges.BracketsAroundPeriod;

import org.junit.Assert;
import org.junit.Test;

public class BracketsAroundPeriodTest {
    BracketsAroundPeriod bap = new BracketsAroundPeriod();

    /**
     * 3.14 with brackets should become 3[.]14
     */
    @Test
    public void bracketsTest1(){
        String input = "3.14";
        String expected = "3[.]14";
        String actual = bap.placeBrackets(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * 9.8 with brackers should become 9[.]8
     */
    @Test
    public void bracketsTest2(){
        String input = "9.8";
        String expected = "9[.]8";
        String actual = bap.placeBrackets(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * 123.456.789 with brackets should become 123[.]456[.]789
     */
    @Test
    public void bracketsTest3(){
        String input = "123.456.789";
        String expected = "123[.]456[.]789";
        String actual = bap.placeBrackets(input);
        Assert.assertEquals(expected, actual);
    }
}
