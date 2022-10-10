package Chapter7.Challenges.PerfectPangram;

import org.junit.Assert;
import org.junit.Test;

public class PerfectPangramTest {
    PerfectPangram pp = new PerfectPangram();
    @Test
    public void perfectTest1(){
        String input = "a quick brown fox jumps over the lazy dog";
        boolean expected = false;
        boolean actual = pp.isPerfectPangram(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void perfectTest2(){
        String input = "hello world";
        boolean expected = false;
        boolean actual = pp.isPerfectPangram(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void perfectTest3(){
        String input = "crwth vox zaps qi gym fjeld bunk";
        boolean expected = true;
        boolean actual = pp.isPerfectPangram(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void perfectTest4(){
        String input = "squdgy kilp job zarf nth cwm vex";
        boolean expected = true;
        boolean actual = pp.isPerfectPangram(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void perfectTest5(){
        String input = "waltz bad nymph for quick jigs vex";
        boolean expected = false;
        boolean actual = pp.isPerfectPangram(input);
        Assert.assertEquals(expected,actual);
    }


}
