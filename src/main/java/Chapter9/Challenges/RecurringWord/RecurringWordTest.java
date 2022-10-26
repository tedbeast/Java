package Chapter9.Challenges.RecurringWord;

import org.junit.Assert;
import org.junit.Test;

public class RecurringWordTest {
    RecurringWord rw = new RecurringWord();
    @Test
    public void recurringTest1(){
        String input = "abcdef";
        int size = 2;
        boolean expected = false;
        boolean actual = rw.recurringWord(input,2);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void recurringTest2(){
        String input = "abcdefgbcdef";
        int size = 3;
        boolean expected = true;
        boolean actual = rw.recurringWord(input, size);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void recurringTest3(){
        String input = "1234908493230";
        int size = 2;
        boolean expected = true;
        boolean actual = rw.recurringWord(input, size);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void recurringTest4(){
        String input = "zebra giraffe gorilla lion";
        int size = 2;
        boolean expected = true;
        boolean actual = rw.recurringWord(input, size);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void recurringTest5(){
        String input = "pear apple melon";
        int size = 2;
        boolean expected = false;
        boolean actual = rw.recurringWord(input, size);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void recurringTest6(){
        String input = "1234908493230";
        int size = 4;
        boolean expected = false;
        boolean actual = rw.recurringWord(input, size);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void recurringTest7(){
        String input = "zebra giraffe gorilla lion";
        int size = 4;
        boolean expected = false;
        boolean actual = rw.recurringWord(input, size);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void recurringTest8(){
        String input = "zebra giraffe gorilla lion zebro";
        int size = 4;
        boolean expected = true;
        boolean actual = rw.recurringWord(input, size);
        Assert.assertEquals(expected,actual);
    }
}
