package Chapter5.Challenges.StringIsPalindrome;

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

    /**
     * "abcba" is a palindrome, so return true.
     */
    @Test
    public void palindromeTest1(){
        String input = "abcba";
        boolean expected = true;
        Assert.assertEquals(p.pal(input), expected);
    }

    /**
     * "abcde" is not a palindrome, so return false.
     */
    @Test
    public void palindromeTest2(){
        String input = "abcde";
        boolean expected = false;
        Assert.assertEquals(p.pal(input), expected);
    }

    /**
     * "123454321" is a palindrome, so return true.
     */
    @Test
    public void palindromeTest3(){
        String input = "123454321";
        boolean expected = true;
        Assert.assertEquals(p.pal(input), expected);
    }
}
