package Chapter5.Challenges.ReverseAString;

;
import org.junit.Assert;
import org.junit.Test;

public class StringReverseTest {
    StringReverse sr = new StringReverse();
    @Test
    public void StringReverseTest1(){
        String s = "abc";
        String target = "cba";
        Assert.assertEquals(target, sr.reverse(s));
    }
    @Test
    public void StringReverseTest2(){
        String s = "racecar";
        String target = "racecar";
        Assert.assertEquals(target, sr.reverse(s));
    }
    @Test
    public void StringReverseTest3(){
        String s = "f";
        String target = "f";
        Assert.assertEquals(target, sr.reverse(s));
    }
    @Test
    public void StringReverseTest4(){
        String s = "";
        String target = "";
        Assert.assertEquals(target, sr.reverse(s));
    }
    @Test
    public void StringReverseTest5(){
        String s = "pillow";
        String target = "wollip";
        Assert.assertEquals(target, sr.reverse(s));
    }
}