package Chapter7.Challenges.Cipher;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CipherTest {
    public static Cipher c;
    @BeforeClass
    public static void setUp(){
        c = new Cipher();
    }

    /**
     * "abcdef" shifted rightwards once becomes "bcdefg".
     */
    @Test
    public void cipherTest1(){
        String input = "abcdef";
        int increment = 1;
        String output = "bcdefg";
        Assert.assertEquals(output, c.encrypt(input, increment));
    }

    /**
     * "secret" shifted rightwards once "tfdsfu".
     */
    @Test
    public void cipherTest2(){
        String input = "secret";
        int increment = 1;
        String output = "tfdsfu";
        Assert.assertEquals(output, c.encrypt(input, increment));
    }

    /**
     * "abcdef" shifted rightwards twice becomes "cdefgh".
     */
    @Test
    public void cipherTest3(){
        String input = "abcdef";
        int increment = 2;
        String output = "cdefgh";
        Assert.assertEquals(output, c.encrypt(input, increment));
    }

    /**
     * "xyz" shifted rightwards twice becomes "zab".
     */
    @Test
    public void cipherTest5(){
        String input = "xyz";
        int increment = 2;
        String output = "zab";
        Assert.assertEquals(output, c.encrypt(input, increment));
    }

    /**
     * "word" shifted leftwards once becomes "vnqc".
     */
    @Test
    public void cipherTest6(){
        String input = "word";
        int increment = -1;
        String output = "vnqc";
        Assert.assertEquals(output, c.encrypt(input, increment));
    }

    /**
     * "abc" shifted leftwards once becomes "zab".
     */
    @Test
    public void cipherTest7(){
        String input = "abc";
        int increment = -1;
        String output = "zab";
        Assert.assertEquals(output, c.encrypt(input, increment));
    }
}
