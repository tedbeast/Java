package Chapter5.Challenges.WordCount;

import org.junit.Assert;
import org.junit.Test;

public class WordCountTest {
    ReturnWordCount rwc = new ReturnWordCount();
    @Test
    public void wordCountTest1(){
        String input = "apple banana pear melon";
        int expected = 4;
        int actual = rwc.count(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void wordCountTest2(){
        String input = "gorilla giraffe zebra penguin shark bear ostrich";
        int expected = 7;
        int actual = rwc.count(input);
    }
    @Test
    public void wordCountTest3(){
        String input = "alpha bravo charlie";
        int expected = 3;
        int actual = rwc.count(input);
    }
}
