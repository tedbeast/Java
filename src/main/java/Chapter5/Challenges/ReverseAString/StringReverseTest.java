package Chapter5.Challenges.ReverseAString;

;
import org.junit.Assert;
import org.junit.Test;

public class StringReverseTest {
    StringReverse sr = new StringReverse();

    /**
     * The reverse of "abc" is "cba".
     */
    @Test
    public void StringReverseTest1(){
        String s = "abc";
        String target = "cba";
        Assert.assertEquals(target, sr.reverse(s));
    }

    /**
     * The reverse of "racecar" is "racecar".
     */
    @Test
    public void StringReverseTest2(){
        String s = "racecar";
        String target = "racecar";
        Assert.assertEquals(target, sr.reverse(s));
    }

    /**
     * The reverse of "f" is "f".
     */
    @Test
    public void StringReverseTest3(){
        String s = "f";
        String target = "f";
        Assert.assertEquals(target, sr.reverse(s));
    }

    /**
     * The reverse of "" is "".
     */
    @Test
    public void StringReverseTest4(){
        String s = "";
        String target = "";
        Assert.assertEquals(target, sr.reverse(s));
    }

    /**
     * The reverse of "pillow" is "wollip".
     */
    @Test
    public void StringReverseTest5(){
        String s = "pillow";
        String target = "wollip";
        Assert.assertEquals(target, sr.reverse(s));
    }
}