package Chapter1.Challenges._Parrot;

import org.junit.Assert;
import org.junit.Test;

/*
This challenge's method will receive a String parameter named text. The method should return it.
 */
public class ParrotTest {
    Parrot p = new Parrot();

    /**
     * If p.copy is passed in "hello", it should return "hello".
     */
    @Test
    public void parrotTestHello(){
        String input = "hello";
        String expected = "hello";
        String actual = p.copy(input);
        Assert.assertEquals(expected, actual);
    }
    /**
     * If p.copy is passed in "polly", it should return "polly".
     */
    @Test
    public void parrotTestPolly(){
        String input = "polly";
        String expected = "polly";
        String actual = p.copy(input);
        Assert.assertEquals(expected, actual);
    }
}
