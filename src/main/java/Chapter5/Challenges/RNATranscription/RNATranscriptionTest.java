package Chapter5.Challenges.RNATranscription;

import org.junit.Assert;
import org.junit.Test;

/*
T becomes A,
A becomes U,
C becomes G,
G becomes C.
 */
public class RNATranscriptionTest {
    RNATranscription rna = new RNATranscription();
    @Test
    public void transcriptionTest1(){
        String input = "TACG";
        String actual = rna.transcript(input);
        String expected = "AUGC";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void transcriptionTest2(){
        String input = "GATTACA";
        String actual = rna.transcript(input);
        String expected = "CUAAUGU";
        Assert.assertEquals(expected, actual);
    }
}
