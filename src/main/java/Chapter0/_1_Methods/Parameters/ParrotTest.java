package Chapter0._1_Methods.Parameters;

import org.junit.Assert;
import org.junit.Test;

public class ParrotTest {
    Parrot p = new Parrot();

    /**
     * If p.copy is passed "hello", it should return "hello".
     */
    @Test
    public void parrotTestHello(){
        String input = "hello";
        String expected = "hello";
        String actual = p.copy(input);
        Assert.assertEquals(expected, actual);
    }
    /**
     * If p.copy is passed "polly", it should return "polly".
     */
    @Test
    public void parrotTestPolly(){
        String input = "polly";
        String expected = "polly";
        String actual = p.copy(input);
        Assert.assertEquals(expected, actual);
    }
}
