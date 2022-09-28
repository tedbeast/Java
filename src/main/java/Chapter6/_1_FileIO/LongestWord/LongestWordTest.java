package Chapter6._1_FileIO.LongestWord;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class LongestWordTest {
    LongestWord lw = new LongestWord();
    @Test
    public void longestTest1() throws FileNotFoundException {
        String filepath = "src/main/resources/Files/ExactitudeOfScience.txt";
        String actual = lw.getLongestWord(filepath);
        String expected = "Unconscionable";
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void longestTest2() throws FileNotFoundException {
        String filepath = "src/main/resources/Files/GardenOfForkingPaths.txt";
        String actual = lw.getLongestWord(filepath);
//        this test accepts either the first instance of longest word or the last.
        String expected1 = "Serre-Montauban,";
        String expected2 = "silk-manuscripts";
        Assert.assertTrue(actual.equals(expected1) || actual.equals(expected2));
    }

}
