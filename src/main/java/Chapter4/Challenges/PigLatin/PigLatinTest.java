package Chapter4.Challenges.PigLatin;

import org.junit.Assert;
import org.junit.Test;

public class PigLatinTest {
    PigLatin p = new PigLatin();

    /**
     * The pig latin form of "banana" is "ananabay".
     */
    @Test
    public void pigLatinTest1(){
        String input = "banana";
        String expected = "ananabay";
        String actual = p.returnPigLatin(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * The pig latin form of "pear" is "earpay".
     */
    @Test
    public void pigLatinTest2(){
        String input = "pear";
        String expected = "earpay";
        String actual = p.returnPigLatin(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * The pig latin form of "peach" is "eachpay".
     */
    @Test
    public void pigLatinTest3(){
        String input = "peach";
        String expected = "eachpay";
        String actual = p.returnPigLatin(input);
        Assert.assertEquals(expected, actual);
    }
}
