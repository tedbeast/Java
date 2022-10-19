package Chapter7.Challenges.Pangram;

import org.junit.Assert;
import org.junit.Test;

public class PangramTest {
    Pangram p = new Pangram();

    /**
     * This sentence contains all the letters of the alphabet, so it is a pangram.
     */
    @Test
    public void pangramTest1(){
        String input = "a quick brown fox jumps over the lazy dog";
        boolean expected = true;
        boolean actual = p.isPangram(input);
        Assert.assertEquals(actual, expected);
    }
    /**
     * This sentence contains all the letters of the alphabet, so it is a pangram.
     */
    @Test
    public void pangramTest2(){
        String input = "waltz bad nymph for quick jigs vex";
        boolean expected = true;
        boolean actual = p.isPangram(input);
        Assert.assertEquals(actual, expected);
    }
    /**
     * This sentence does not contain all the letters of the alphabet, so it is not a pangram.
     */
    @Test
    public void pangramTest3(){
        String input = "hello world";
        boolean expected = false;
        boolean actual = p.isPangram(input);
        Assert.assertEquals(actual, expected);
    }
    /**
     * This sentence does not contain all the letters of the alphabet, so it is not a pangram.
     */
    @Test
    public void pangramTest4(){
        String input = "a pangram or holoalphabetic sentence is a sentence using every letter of a given alphabet at least once.";
        boolean expected = false;
        boolean actual = p.isPangram(input);
        Assert.assertEquals(actual, expected);
    }


}

