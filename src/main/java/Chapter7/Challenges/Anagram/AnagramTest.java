package Chapter7.Challenges.Anagram;

import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {
    Anagram a = new Anagram();
    @Test
    public void anagramTest1(){
        String input1 = "cat";
        String input2 = "tac";
        boolean expected = true;
        boolean actual = a.check(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void anagramTest2(){
        String input1 = "restful";
        String input2 = "fluster";
        boolean expected = true;
        boolean actual = a.check(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void anagramTest3(){
        String input1 = "anagram";
        String input2 = "margana";
        boolean expected = true;
        boolean actual = a.check(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void anagramTest4(){
        String input1 = "cat";
        String input2 = "dog";
        boolean expected = false;
        boolean actual = a.check(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void anagramTest5(){
        String input1 = "anagram";
        String input2 = "margarn";
        boolean expected = false;
        boolean actual = a.check(input1, input2);
        Assert.assertEquals(expected, actual);
    }
}
