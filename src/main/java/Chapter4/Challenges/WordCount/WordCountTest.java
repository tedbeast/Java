package Chapter4.Challenges.WordCount;

import org.junit.Assert;
import org.junit.Test;

public class WordCountTest {
    ReturnWordCount rwc = new ReturnWordCount();

    /**
     * The sentence "apple banana pear melon" contains 4 words.
     */
    @Test
    public void wordCountTest1(){
        String input = "apple banana pear melon";
        int expected = 4;
        int actual = rwc.count(input);
        Assert.assertEquals(expected, actual);
    }
    /**
     * The sentence "gorilla giraffe zebra penguin shark bear ostrich" contains 7 words.
     */
    @Test
    public void wordCountTest2(){
        String input = "gorilla giraffe zebra penguin shark bear ostrich";
        int expected = 7;
        int actual = rwc.count(input);
    }

    /**
     * The sentence "alpha bravo charlie" contains 3 words.
     */
    @Test
    public void wordCountTest3(){
        String input = "alpha bravo charlie";
        int expected = 3;
        int actual = rwc.count(input);
    }
}
