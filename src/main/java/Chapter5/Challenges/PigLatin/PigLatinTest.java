package Chapter5.Challenges.PigLatin;

import org.junit.Assert;
import org.junit.Test;

public class PigLatinTest {
    PigLatin p = new PigLatin();
    @Test
    public void pigLatinTest1(){
        String input = "banana";
        String expected = "ananabay";
        String actual = p.returnPigLatin(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void pigLatinTest2(){
        String input = "pear";
        String expected = "earpay";
        String actual = p.returnPigLatin(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void pigLatinTest3(){
        String input = "peach";
        String expected = "eachpay";
        String actual = p.returnPigLatin(input);
        Assert.assertEquals(expected, actual);
    }
}
