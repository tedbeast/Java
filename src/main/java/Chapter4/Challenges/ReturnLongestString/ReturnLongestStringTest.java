package Chapter4.Challenges.ReturnLongestString;

;
import org.junit.Assert;
import org.junit.Test;

public class ReturnLongestStringTest {
    ReturnLongestString rls = new ReturnLongestString();
    @Test
    public void ReturnLongestStringTest1(){
        String[] s = {"abc", "def", "hijk"};
        String target = "hijk";
        Assert.assertEquals(target, rls.longest(s));
    }
    @Test
    public void ReturnLongestStringTest2(){
        String[] s = {"abc", "defsdgh", "hijkfdgafgafg"};
        String target = "hijkfdgafgafg";
        Assert.assertEquals(target, rls.longest(s));
    }
    @Test
    public void ReturnLongestStringTest3(){
        String[] s = {"abc", "defsdgh", "hijk"};
        String target = "defsdgh";
        Assert.assertEquals(target, rls.longest(s));
    }
}
