package Chapter4.Challenges.ReturnLongestString;

;
import org.junit.Assert;
import org.junit.Test;

public class ReturnLongestStringTest {
    ReturnLongestString rls = new ReturnLongestString();

    /**
     * of the strings {"abc", "def", "hijk"}, "hijk" is the longest.
     */
    @Test
    public void ReturnLongestStringTest1(){
        String[] s = {"abc", "def", "hijk"};
        String target = "hijk";
        Assert.assertEquals(target, rls.longest(s));
    }

    /**
     * of the strings {"abc", "defsdgh", "hijkfdgafgafg"}, "hijkfdgafgafg" is the longest.
     */
    @Test
    public void ReturnLongestStringTest2(){
        String[] s = {"abc", "defsdgh", "hijkfdgafgafg"};
        String target = "hijkfdgafgafg";
        Assert.assertEquals(target, rls.longest(s));
    }
    /**
     * of the strings {"abc", "defsdgh", "hijk"}, "defsdgh" is the longest.
     */
    @Test
    public void ReturnLongestStringTest3(){
        String[] s = {"abc", "defsdgh", "hijk"};
        String target = "defsdgh";
        Assert.assertEquals(target, rls.longest(s));
    }
}
