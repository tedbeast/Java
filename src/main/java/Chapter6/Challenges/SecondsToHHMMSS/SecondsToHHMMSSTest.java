package Chapter6.Challenges.SecondsToHHMMSS;


import org.junit.Assert;
import org.junit.Test;

public class SecondsToHHMMSSTest {
    SecondsToHHMMSS secondsToHHMMSS = new SecondsToHHMMSS();

    /**
     * 1432 seconds converted to HH:MM:SS is 00:23:52.
     */
    @Test
    public void convertTest1(){
        int input = 1432;
        String expected = "00:23:52";
        String actual = secondsToHHMMSS.convert(input);
        Assert.assertEquals(expected,actual);
    }
    /**
     * 12345 seconds converted to HH:MM:SS is 03:25:45.
     */
    @Test
    public void convertTest2(){
        int input = 12345;
        String expected = "03:25:45";
        String actual = secondsToHHMMSS.convert(input);
        Assert.assertEquals(expected,actual);
    }
    /**
     * 9999 seconds converted to HH:MM:SS is 02:46:39.
     */
    @Test
    public void convertTest3(){
        int input = 12345;
        String expected = "02:46:39";
        String actual = secondsToHHMMSS.convert(input);
        Assert.assertEquals(expected,actual);
    }
}
