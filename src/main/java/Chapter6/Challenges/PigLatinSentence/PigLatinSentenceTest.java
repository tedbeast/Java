package Chapter6.Challenges.PigLatinSentence;

import org.junit.Assert;
import org.junit.Test;

public class PigLatinSentenceTest {
    PigLatinSentence pls = new PigLatinSentence();
    @Test
    public void pigLatinSentence1(){
        String input = "apple banana pear";
        String expected = "ppleaay ananabay earpay";
        String actual = pls.returnPigLatinSentence(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pigLatinSentence2(){
        String input = "zebra shark penguin";
        String expected = "ebrazay harksay enguinpay";
        String actual = pls.returnPigLatinSentence(input);
        Assert.assertEquals(expected, actual);
    }
}
