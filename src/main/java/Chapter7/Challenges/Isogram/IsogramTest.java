package Chapter7.Challenges.Isogram;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsogramTest {
    Isogram iso;
    @Before
    public void setUp(){
        iso = new Isogram();
    }

    /**
     * cat contains all its letters once, so it is an isogram.
     */
    @Test
    public void isoTest1(){
        String input = "cat";
        boolean expected = true;
        boolean actual = iso.isIsogram(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * isogram contains all of its letters once, so it is an isogram.
     */
    @Test
    public void isoTest2(){
        String input = "isogram";
        boolean expected = true;
        boolean actual = iso.isIsogram(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * uncopyrightable contains all of its letters once, so it is an isogram.
     */
    @Test
    public void isoTest3(){
        String input = "uncopyrightable";
        boolean expected = true;
        boolean actual = iso.isIsogram(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * egg has repeating letters, so it is not an isogram
     */
    @Test
    public void isoTest4(){
        String input = "egg";
        boolean expected = false;
        boolean actual = iso.isIsogram(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * java has repeating letters, so it is not an isogram
     */
    @Test
    public void isoTest5(){
        String input = "java";
        boolean expected = false;
        boolean actual = iso.isIsogram(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * programming has repeating letters, so it is not an isogram
     */
    @Test
    public void isoTest6(){
        String input = "programming";
        boolean expected = false;
        boolean actual = iso.isIsogram(input);
        Assert.assertEquals(expected, actual);
    }
}
