package Chapter4.Challenges.Pyramid;

import org.junit.Assert;
import org.junit.Test;

public class PyramidTest {
    Pyramid p = new Pyramid();
    @Test
    public void pyramidTest1(){
        int input = 5;
        String expected = "*\n**\n***\n****\n*****";
        String actual = p.returnPyramid(input).trim();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void pyramidTest2(){
        int input = 2;
        String expected = "*\n**";
        String actual = p.returnPyramid(input).trim();
        Assert.assertEquals(expected,actual);
    }
}
