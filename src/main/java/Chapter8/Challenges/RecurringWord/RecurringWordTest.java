package Chapter8.Challenges.RecurringWord;

import org.junit.Assert;
import org.junit.Test;

public class RecurringWordTest {
    RecurringWord rw = new RecurringWord();
    @Test
    public void recurringTest1(){
        String input = "abcdef";
        boolean expected = false;
        boolean actual = rw.recurringWord(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void recurringTest2(){
        String input = "abcdefgbcdef";
        boolean expected = true;
        boolean actual = rw.recurringWord(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void recurringTest3(){
        String input = "1234908493230";
        boolean expected = true;
        boolean actual = rw.recurringWord(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void recurringTest4(){
        String input = "zebra giraffe gorilla lion";
        boolean expected = true;
        boolean actual = rw.recurringWord(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void recurringTest5(){
        String input = "pear apple melon";
        boolean expected = false;
        boolean actual = rw.recurringWord(input);
        Assert.assertEquals(expected,actual);
    }
}
