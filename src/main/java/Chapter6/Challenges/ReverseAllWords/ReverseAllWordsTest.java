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
    @Test
    public void rawTest1(){
        String input = "abc xyz";
        String expected = "cba zyx";
        Assert.assertEquals(raw.reverse(input), expected);
    }
    @Test
    public void rawTest2(){
        String input = "this is the original";
        String expected = "siht si eht lanigiro";
        Assert.assertEquals(raw.reverse(input), expected);
    }
}
