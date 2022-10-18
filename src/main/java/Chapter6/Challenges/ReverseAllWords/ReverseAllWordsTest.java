package Chapter6.Challenges.ReverseAllWords;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ReverseAllWordsTest {
    public static ReverseAllWords raw;
    @BeforeClass
    public static void setUp(){
        raw = new ReverseAllWords();
    }

    /**
     * "abc xyz" with every word in reverse order is "cba zyx".
     */
    @Test
    public void rawTest1(){
        String input = "abc xyz";
        String expected = "cba zyx";
        Assert.assertEquals(raw.reverse(input), expected);
    }

    /**
     * "this is the original" with every word in reverse order is "siht si eht lanigiro".
     */
    @Test
    public void rawTest2(){
        String input = "this is the original";
        String expected = "siht si eht lanigiro";
        Assert.assertEquals(raw.reverse(input), expected);
    }
}
