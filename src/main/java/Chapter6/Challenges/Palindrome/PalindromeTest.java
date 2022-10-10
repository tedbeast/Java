package Chapter6.Challenges.Palindrome;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PalindromeTest {
    public static Palindrome p;
    @BeforeClass
    public static void setUp(){
        p = new Palindrome();
    }
    @Test
    public void palindromeTest1(){
        String input = "abcba";
        boolean expected = true;
        Assert.assertEquals(p.pal(input), expected);
    }
    @Test
    public void palindromeTest2(){
        String input = "abcde";
        boolean expected = false;
        Assert.assertEquals(p.pal(input), expected);
    }
    @Test
    public void palindromeTest3(){
        String input = "123454321";
        boolean expected = true;
        Assert.assertEquals(p.pal(input), expected);
    }
}
