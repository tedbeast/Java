package Chapter6.Challenges.RemoveAllCharacter;

import org.junit.Assert;
import org.junit.Test;

public class RemoveAllCharacterTest {
    RemoveAllCharacter rac = new RemoveAllCharacter();
    @Test
    public void removeTest1(){
        String input = "abcdef";
        String removed = "c";
        String expected = "abdef";
        String actual = rac.removeAll(input, removed);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeTest2(){
        String input = "gorilla";
        String removed = "l";
        String expected = "goria";
        String actual = rac.removeAll(input, removed);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeTest3(){
        String input = "banana";
        String removed = "a";
        String expected = "bnn";
        String actual = rac.removeAll(input, removed);
        Assert.assertEquals(expected,actual);
    }
}
