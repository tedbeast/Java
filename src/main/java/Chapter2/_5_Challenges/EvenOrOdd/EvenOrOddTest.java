package Chapter2._5_Challenges.EvenOrOdd;

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
    @Test
    public void evenTest1(){
        Assert.assertEquals(eoo.decide(4), "Even");
    }
    @Test
    public void evenTest2(){
        Assert.assertEquals(eoo.decide(0), "Even");
    }
    @Test
    public void evenTest3(){
        Assert.assertEquals(eoo.decide(12), "Even");
    }
    @Test
    public void oddTest1(){
        Assert.assertEquals(eoo.decide(3), "Odd");
    }
    @Test
    public void oddTest2(){
        Assert.assertEquals(eoo.decide(-5), "Odd");
    }
}
