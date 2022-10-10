package Chapter2.Challenges.EvenOrOdd;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class EvenOrOddTest {
    static EvenOrOdd eoo;
    @BeforeClass
    public static void setUp(){
        eoo = new EvenOrOdd();
    }

    /**
     * Because 4 is even, eoo.decide(4) should return "Even".
     */
    @Test
    public void evenTest1(){
        Assert.assertEquals(eoo.decide(4), "Even");
    }
    /**
     * Because 0 is even, eoo.decide(4) should return "Even".
     */
    @Test
    public void evenTest2(){
        Assert.assertEquals(eoo.decide(0), "Even");
    }
    /**
     * Because 12 is even, eoo.decide(4) should return "Even".
     */
    @Test
    public void evenTest3(){
        Assert.assertEquals(eoo.decide(12), "Even");
    }
    /**
     * Because 3 is odd, eoo.decide(3) should return "Odd".
     */
    @Test
    public void oddTest1(){
        Assert.assertEquals(eoo.decide(3), "Odd");
    }
    /**
     * Because -5 is odd, eoo.decide(3) should return "Odd".
     */
    @Test
    public void oddTest2(){
        Assert.assertEquals(eoo.decide(-5), "Odd");
    }
}
